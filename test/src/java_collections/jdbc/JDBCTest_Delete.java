package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest_Delete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "green";
		String password = "1234";
		
		Connection conn = DriverManager.getConnection(url,user,password);
		
		Statement stmt = conn.createStatement();
		
		String query = "DELETE FROM tbl_member";
		int result = stmt.executeUpdate(query);
		
		System.out.println("result : " + result);
	}

}
