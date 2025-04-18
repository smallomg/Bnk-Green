package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest_Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "green";
		String password = "1234";

		Connection conn = DriverManager.getConnection(url, user, password);

		Statement stmt = conn.createStatement();

		String query = "INSERT INTO tbl_member VALUES('fff','1234','세번째','010-2352-4862','C')";
		int result = stmt.executeUpdate(query);

		System.out.println("result : " + result);

	}

}
