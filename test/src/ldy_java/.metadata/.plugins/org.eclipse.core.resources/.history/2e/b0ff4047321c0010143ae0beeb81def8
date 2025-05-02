package ex05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Member_Service {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public JDBC_Member_Service() {
		conn = DBConn.getConnection();
	}
	
	public int insert(Member member)  {
		// 쿼리 실행
		String query = "INSERT INTO tbl_member VALUES(?, ?, ?, ?, ?)";

		// grade : char -> String
		char temp_grade = member.getGrade();		
		String grade = String.valueOf(temp_grade); 
		
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getPhone());
			pstmt.setString(5, grade);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public Member select(String input_id, String input_pw)  {
		String query = "SELECT * FROM tbl_member WHERE id=? AND pw=?";
	    Member member = null;

	    try {
	        pstmt = conn.prepareStatement(query);
	        pstmt.setString(1, input_id);
	        pstmt.setString(2, input_pw);
	        rs = pstmt.executeQuery();

	        if (rs.next()) {
	            member = new Member();  

	            String id = rs.getString("id");
	            String pw = rs.getString("pw");
	            String name = rs.getString("name");
	            String phone = rs.getString("phone");
	            String grade_temp = rs.getString("grade");
	            char grade = grade_temp.charAt(0);

	            member.setId(id);
	            member.setPw(pw);
	            member.setName(name);
	            member.setPhone(phone);
	            member.setGrade(grade);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

		return member;
	}

	public int update(Member member) throws ClassNotFoundException, SQLException {
		
		// 쿼리 실행
		String query = "UPDATE tbl_member SET grade=? WHERE name=?";
		
		char temp_grade = member.getGrade();
		String grade = String.valueOf(temp_grade); 
		
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, grade);
		pstmt.setString(2, member.getName());
		
		
		int result = pstmt.executeUpdate();
		return result;
	}
	
	public int delete(Member member) throws ClassNotFoundException, SQLException {
		// 쿼리문
		String query = "DELETE FROM tbl_member WHERE id=?";
		
		// 쿼릴 실행 객체
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, member.getId());
		
		int result = pstmt.executeUpdate(query);
		return result;
	}
	
	public boolean isDuplicatedId(String id) {
		String query = "SELECT * FROM tbl_member WHERE id=?";
		boolean isDuplicate = false;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				isDuplicate = true;
			} else {
				isDuplicate = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return isDuplicate;
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
