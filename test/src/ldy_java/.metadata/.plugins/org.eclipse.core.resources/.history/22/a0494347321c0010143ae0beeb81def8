package ex04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ex01.Member;

public class JDBC_Service {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public JDBC_Service() {
		try {
            // 분리된 DB 연결 객체 호출
            conn = DBConn2.getConnection();

            // 연결이 성공했을 경우 Statement 생성
            if (conn != null) {
                stmt = conn.createStatement();
            } else {
                System.out.println("DB 연결에 실패했습니다.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
		
		/*
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:testdb";
			String uid = "green";
			String upw = "1234";

			// DB 연결 객체
			conn = DriverManager.getConnection(url, uid, upw);
			stmt = conn.createStatement();
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		*/
	}
	
	public int insert(Member member)
			throws ClassNotFoundException, SQLException {
		/*
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String uid = "green";
		String upw = "1234";

		// DB 연결 객체
		Connection conn = DriverManager.getConnection(url, uid, upw);

		// 쿼리 실행 객체
		Statement stmt = conn.createStatement();
		*/
		
		// 쿼리 실행
		String query = "INSERT INTO tbl_member VALUES('" 
				+ member.getId() + "' , '" 
				+ member.getPw() + "', '" 
				+ member.getName() + "', '" 
				+ member.getPhone() + "', '"
				+ member.getGrade() + "')";
		
		int result = stmt.executeUpdate(query);
		return result;
	}
	
	public List<Member> selectAll() throws ClassNotFoundException, SQLException {
		/*
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String uid = "green";
		String upw = "1234";

		// DB 연결 객체
		Connection conn = DriverManager.getConnection(url, uid, upw);

		// 쿼리 실행 객체
		Statement stmt = conn.createStatement();
		*/
		
		String query = "SELECT * FROM tbl_member";	 
		
		// ResultSet rs = stmt.executeQuery(query);	
		
		rs = stmt.executeQuery(query);	
		List<Member> list = new ArrayList<>();
		
		while(rs.next()) {
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
			
			list.add(member);	// 멤버 객체 리스트에 추가
		}
		
		return list;
	}
	
	public Member selectOne() throws ClassNotFoundException, SQLException {
		/*
		Class.forName("oracle.jdbc.driver.OracleDriver");			// oracle DB driver
		
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";		// db의 원격 주소, 호스트이름:포트:SID	<-- 이렇게 구성됨
		String user = "green";			// 접속하는 사용자 계정
		String password = "1234";		// 접속하는 사용자 패스워드
		
		// 접속 객체 생성 
		Connection conn = DriverManager.getConnection(url, user, password);
		
		// 쿼리 실행 담당 - Statement
		Statement stmt = conn.createStatement();	// 쿼리문을 담아서 실행하는 객체
		*/
		
		String query = "SELECT * FROM tbl_member";	// 실행할 쿼리문
		
		// SELECT 쿼리를 실행해서 데이터베이스의 결과를 ResultSet 객체로 반환
		
		// ResultSet rs = stmt.executeQuery(query);	
		rs = stmt.executeQuery(query);	
		rs.next();	
		
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

		return member;
	}

	public int update(Member member) throws ClassNotFoundException, SQLException {
		/*
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String uid = "green";
		String upw = "1234";

		// DB 연결 객체
		Connection conn = DriverManager.getConnection(url, uid, upw);
		
		// 쿼리 실행 객체
		Statement stmt = conn.createStatement();
		*/
		
		
		// 쿼리 실행
		String query = "UPDATE tbl_member SET grade = '" 
				+ member.getGrade() + "' WHERE name = '"
				+ member.getId() + "'";
		
		int result = stmt.executeUpdate(query);
		return result;
	}
	
	public int delete(Member member) throws ClassNotFoundException, SQLException {
		/*
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String uid = "green";
		String upw = "1234";
		
		Connection conn = DriverManager.getConnection(url, uid, upw);
		
		Statement stmt = conn.createStatement();
		*/
		
		
		// 쿼리문
		String query = 
				"DELETE FROM tbl_member WHERE id = '"
				+ member.getId() + "'";
		int result = stmt.executeUpdate(query);
		return result;
	}
	
	
	public void close() {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
            System.out.println("DB 연결이 닫혔습니다.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
