package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;		// 중요함!!!	java.beans가 아니라 java.sql을 import 해야함
import java.util.ArrayList;
import java.util.List;

public class Jdbc_test_select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		List<Member> list = new ArrayList<>();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");			// oracle DB driver
		
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";		// db의 원격 주소, 호스트이름:포트:SID	<-- 이렇게 구성됨
		String user = "green";			// 접속하는 사용자 계정
		String password = "1234";		// 접속하는 사용자 패스워드
		
		// 접속 객체 생성 
		Connection conn = DriverManager.getConnection(url, user, password);
		
		// 쿼리 실행 담당 - Statement
		Statement stmt = conn.createStatement();	// 쿼리문을 담아서 실행하는 객체
		String query = "SELECT * FROM tbl_member";	// 실행할 쿼리문
		
		// SELECT 쿼리를 실행해서 데이터베이스의 결과를 ResultSet 객체로 반환
		ResultSet rs = stmt.executeQuery(query);	
		
		// ResultSet에서 첫번째를 시작하게 한다
		// rs.next를 하지않으면 데이터를 못 읽는다
		// rs는 처음에 가리키는 것은 ==> id - pw - name - phone - grade 
		// rs.next를 하면 다음 행을 가리키게 된다 ==> user101 - 1234 - user1 - 010-3421-3212 - C
		
		// 조회한 데이터가 여러개일수 있으니, 반복문을 사용한다
		// rs.next() : rs에 처음부터 하나씩 가져오면서, 다음것이 있다면 true 를 반환한다
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
		
		for(Member m : list) {
			System.out.println(m);
		}
		
		/*
		// ResultSet에서 첫번째를 시작하게 한다
		// rs.next를 하지않으면 데이터를 못 읽는다
		// rs는 처음에 가리키는 것은 ==> id - pw - name - phone - grade 
		// rs.next를 하면 다음 행을 가리키게 된다 ==> user101 - 1234 - user1 - 010
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
		
		System.out.println(member);
		*/
	}
}

//쿼리문

// 쿼리문 실행
// 만일 select 쿼리일 경우 조회한 데이터를 받기


/*
회원가입 메뉴
회원가입 기능 구현

행동 메뉴
게시글 작성 -> 게시글 작성 성공시 게시글 목록으로 이동
게시글 목록 -> 게시글 목록으로 이동
게시글 조회 -> 전체, 특정 선택 -> 

*/