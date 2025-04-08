package Inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Login_Page {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		SignUp su1 = new SignUp();
		SignUp su2 = new SignUp();
		SignUp su3 = new SignUp();

		ArrayList<SignUp> slist = new ArrayList<>();

		slist.add(su1);
		slist.add(su2);
		slist.add(su3);

		
		for (;;) {
			System.out.println("종료 [0] 회원가입 [1] 로그인 [2]");
			int input = sc.nextInt();
			if (input == 0) {
				break;
			}
			if (input == 1) {
				for (int i = 0; i < slist.size(); i++) {
					System.out.println("아이디를 입력하세요");
					String id = sc.next();
					slist.get(i).setId(id);
					System.out.println("비밀번호를 입력하세요");
					String password = sc.next();
					slist.get(i).setPassword(password);
				}
				System.out.println("로그인페이지로 이동해주세요");
			}
			if (input == 2) {
				System.out.println("로그인페이지임");
				for (int i = 0; i < slist.size(); i++) {
					System.out.println((i+1)+"번째");
					System.out.print(slist.get(i).getId()+" ");
					System.out.print(slist.get(i).getPassword()+" ");
					System.out.print("\n");
					
				}
			}
		}

	}

}
