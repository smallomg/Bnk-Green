package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_test_insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String uid = "green";
		String upw = "1234";
		
		Connection conn = DriverManager.getConnection(url, uid, upw);
	
		Statement stmt = conn.createStatement();
		
		// 쿼리 실행
		String query = "INSERT INTO tbl_member VALUES('ddd', '1234', 'Denver', '013-4444-2132', 'A')";
		int result = stmt.executeUpdate(query);		// 쿼리 실행 - insert, update
		
		System.out.println("result : " + result);	// 성공:1		실패:0
	}
}
