package ex04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn {
	public Statement startInit() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String uid = "green";
		String upw = "1234";
		
		// DB 연결 객체
		Connection conn = DriverManager.getConnection(url, uid, upw);
		
		// 쿼리 실행 객체
		return conn.createStatement();
	}
}
