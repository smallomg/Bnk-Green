package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_test_insert2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String uid = "green";
		String upw = "1234";
		
		Connection conn = DriverManager.getConnection(url, uid, upw);
	
		String id = "xxx";
		String pw = "1234";
		String name = "xman";
		String phone = "010-2131-2131";
		String grade = "A"; 
		
		// 쿼리문
		String query = "INSERT INTO tbl_member VALUES(?, ?, ?, ?, ?)";		
		
		// 쿼리 실행 객체
		// Statement stmt = conn.createStatement();
		// prepareStatement는 객체 생성할때 쿼리문을 넣는다, 쿼리를 실행할때 쿼리를 넣지 않는다
		PreparedStatement pstmt = conn.prepareStatement(query); 
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		pstmt.setString(3, name);
		pstmt.setString(4, phone);
		pstmt.setString(5, grade);
		
		// 쿼리 실행
		int result = pstmt.executeUpdate();		// 쿼리 실행 - insert, update
		
		System.out.println("result : " + result);	// 성공:1		실패:0
	}
}
