package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_test_delete2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String uid = "green";
		String upw = "1234";
		
		Connection conn = DriverManager.getConnection(url, uid, upw);
	
		// 쿼리문
		String query = "DELETE FROM tbl_member WHERE name=?";
		String name = "xman";
		
		// 쿼리 실행 객체
		//Statement stmt = conn.createStatement();
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setString(1, name);
		
		int result = pstmt.executeUpdate();
		
		System.out.println("result : " + result);
	}

}
