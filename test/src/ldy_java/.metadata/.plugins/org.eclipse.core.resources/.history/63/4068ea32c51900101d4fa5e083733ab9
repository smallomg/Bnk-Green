package ex05;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBC_Board_Service {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public JDBC_Board_Service() {
		conn = DBConn.getConnection();
	}
	
	// 게시글 작성
	public int insert(Board board)  {
		int result = 0;
		String query = "INSERT INTO tbl_board VALUES(?, ?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, board.getBno());
			pstmt.setString(1, board.getTitle());
			pstmt.setString(1, board.getContent());
			pstmt.setString(1, board.getWriter());
			pstmt.setDate(1, board.getRegDate());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	// 게시글 전체조회
	public List<Board> selectAll()  {
		List<Board> list = new ArrayList<>();
		String query = "SELECT * FROM tbl_member";
	    
	    try {
	        pstmt = conn.prepareStatement(query);
	        rs = pstmt.executeQuery();

	        while(rs.next()) {
	            int bno = rs.getInt("id");
	            String title = rs.getString("title");
	            String content = rs.getString("content");
	            String writer = rs.getString("writer");
                Date regDate = rs.getDate("regdate");

	            Board board = new Board();  
	            board.setBno(bno);
	            board.setTitle(title);
	            board.setContent(content);
	            board.setWriter(writer);
	            board.setRegDate(regDate);
	            
	            list.add(board);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

		return list;
	}

	public List<Board> select(String input_title)  {
		List<Board> list = new ArrayList<>();
		String query = "SELECT * FROM tbl_member WHERE title LIKE ?";
		
	    try {
	        pstmt = conn.prepareStatement(query);
	        pstmt.setString(1, "%" + input_title + "%");
	        rs = pstmt.executeQuery();

	        while(rs.next()) {
	            int bno = rs.getInt("id");
	            String title = rs.getString("title");
	            String content = rs.getString("content");
	            String writer = rs.getString("writer");
                Date regDate = rs.getDate("regdate");

	            Board board = new Board();  
	            board.setBno(bno);
	            board.setTitle(title);
	            board.setContent(content);
	            board.setWriter(writer);
	            board.setRegDate(regDate);
	            
	            list.add(board);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

		return list;
	}

	public void update(Member member) {
		
	}
	
	public int delete(int bno)  {
		int result = 0;
		String query = "DELETE FROM tbl_board WHERE bno=?";
		
		// 쿼릴 실행 객체
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bno);
			result = pstmt.executeUpdate(query);	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	
	public void close() {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
            System.out.println("DB 연결이 닫혔습니다.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
