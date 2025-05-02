package ex04;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import ex01.Member;

public class MemberUtil {
	public void createUser(Statement stmt, Member currentUser) throws SQLException {
		// Member currentUser = new Member();
		String id;
		String pw;
		String name;
		String phone;
		char grade;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입 해주시기 바랍니다");

		System.out.print("아이디 : ");
		id = sc.next();
		System.out.print("비밀번호 : ");
		pw = sc.next();
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("연락처 : ");
		phone = sc.next();
		grade = 'C';
		
		String query_insert = "INSERT INTO tbl_member VALUES('" + id + "', '" + pw + "', '" + name + "', '" + phone + "', '" + grade + "')";
		int result_insert = stmt.executeUpdate(query_insert);

		if(result_insert != 0) {
			System.out.println("회원가입에 성공했습니다!!");
			currentUser.setId(id);
			currentUser.setPw(pw);
			currentUser.setName(name);
			currentUser.setPhone(phone);
			currentUser.setGrade(grade);
		} else {
			System.out.println("회원가입에 실패했습니다..");
		}
	}
}
