package ex04;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public BoardDAO() {
		conn = DBConn.getConnection();
	}

	// 등록
	public int insert(Board board) {
		int result = 0;
		String query = "INSERT INTO tbl_board VALUES(seq_board.nextval,?,?,?,SYSDATE)";

		try {
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getWriter());

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public Board select(String title) {
		String query = "SELECT * FROM tbl_board WHERE title = ?";
		Board b = new Board();
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, title);
			rs = pstmt.executeQuery();

			rs.next();
			b.setBno(rs.getInt("bno"));
			b.setTitle(rs.getString("title"));
			b.setContent(rs.getString("content"));
			b.setWriter(rs.getString("writer"));
			b.setRegdate(rs.getDate("regdate"));
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;

	}
	
	public List<Board> selectAll(String title) {
		List<Board> list = new ArrayList<>();
		String query = "SELECT * FROM tbl_board WHERE title = ?";
		Board b = new Board();
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, title);
			rs = pstmt.executeQuery();

			while (rs.next()) {rs.next();
			b.setBno(rs.getInt("bno"));
			b.setTitle(rs.getString("title"));
			b.setContent(rs.getString("content"));
			b.setWriter(rs.getString("writer"));
			b.setRegdate(rs.getDate("regdate"));
			
			list.add(b);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}

	/*
	 * // 등록시 나오는 조회 public Member select(String id) {
	 * 
	 * String query = "SELECT * FROM member WHERE id = ?"; Member m = new Member();
	 * try { pstmt = conn.prepareStatement(query); pstmt.setString(1, id); rs =
	 * pstmt.executeQuery();
	 * 
	 * rs.next();
	 * 
	 * m.setId(rs.getString("id")); m.setPw(rs.getString("pw"));
	 * m.setName(rs.getString("name")); m.setGrade(rs.getString("grade"));
	 * 
	 * } catch (SQLException e) { e.printStackTrace(); }
	 * 
	 * return m;
	 * 
	 * }
	 * 
	 * // 전체조회 public List<Member> selectAll() {
	 * 
	 * List<Member> list = new ArrayList<>(); String query = "SELECT * FROM member";
	 * 
	 * try { pstmt = conn.prepareStatement(query); rs = pstmt.executeQuery();
	 * 
	 * while (rs.next()) { String id = rs.getString("id"); String pw =
	 * rs.getString("pw"); String name = rs.getString("name"); String grade =
	 * rs.getString("grade");
	 * 
	 * Member m = new Member(); m.setId(id); m.setPw(pw); m.setName(name);
	 * m.setGrade(grade);
	 * 
	 * list.add(m); } } catch (SQLException e) { e.printStackTrace(); }
	 * 
	 * return list;
	 * 
	 * }
	 * 
	 * public Member login(String id,String pw) {
	 * 
	 * String query = "SELECT * FROM member WHERE id = ?AND pw = ?"; Member m = new
	 * Member(); try { pstmt = conn.prepareStatement(query); pstmt.setString(1, id);
	 * pstmt.setString(2, pw); rs = pstmt.executeQuery();
	 * 
	 * rs.next();
	 * 
	 * m.setId(rs.getString("id")); m.setPw(rs.getString("pw"));
	 * m.setName(rs.getString("name")); m.setGrade(rs.getString("grade"));
	 * 
	 * } catch (SQLException e) {
	 * 
	 * 
	 * e.printStackTrace(); }
	 * 
	 * return m;
	 * 
	 * }
	 */

}
