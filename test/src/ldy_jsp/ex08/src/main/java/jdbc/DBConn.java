package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	public static Connection getConnection() {
		Connection conn = null;

		if (conn == null) {
			try {
				// JDBC 드라이버 로드
				Class.forName("oracle.jdbc.driver.OracleDriver");

				// DB 접속 정보
				String url = "jdbc:oracle:thin:@localhost:1521:testdb";
				String uid = "green";
				String upw = "1234";

				// 연결 시도
				conn = DriverManager.getConnection(url, uid, upw);
			} catch (ClassNotFoundException e) {
				System.out.println("JDBC 드라이버 로드 실패: " + e.getMessage());
			} catch (SQLException e) {
				System.out.println("DB 연결 실패: " + e.getMessage());
			}
		}
		return conn;
	}
}