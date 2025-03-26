package vo;

import java.util.Scanner;

public class Human_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요.");
		String na = sc.next();
		System.out.print("나이를 입력하세요.");
		int a = sc.nextInt();
		
		Human h1 = new Human();
		Human h2 = new Human();
		Human h3 = new Human(na,a);
		
		h1.setName("아무개");
		h1.setAge(100);
		
		h2.setName("고길동");
		h2.setAge(201);
			
		System.out.println(h1);
		System.out.println();
		System.out.println(h2);
		System.out.println();
		System.out.println(h3);
	}

}
