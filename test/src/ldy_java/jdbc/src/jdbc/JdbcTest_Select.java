package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import collection.Member;

public class JdbcTest_Select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		List<Member> list = new ArrayList<>();

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "green";
		String password = "1234";
		// 접속 담당 - Connection
		Connection conn = DriverManager.getConnection(url, user, password);
		// 쿼리 실행 - Statement
		Statement stmt = conn.createStatement();
		String query = "SELECT * FROM tbl_member";
		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
			Member member = new Member();
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

			list.add(member);

		}

		for (Member m : list) {
			System.out.println(m);
		}

	}

}
