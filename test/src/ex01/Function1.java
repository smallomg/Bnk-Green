package ex01;

import java.util.Scanner;

public class Function1 {

	public static void main(String[] args) {
		// 숫자를 입력하세요 >>
		// 음수를 입력하면 종료
		// 0 포함 짝수일 경우 f1함수 실행
		// 홀수인 경우 f2함수 실행
		// f1 함수 f1출력 실행
		// f2 함수 f2출력 실행

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * for (;;) { int Num = sc.nextInt(); if (Num < 0) {
		 * System.out.println("종료됩니다"); break; }
		 * 
		 * if (Num % 2 == 0) { f1(); } if (Num % 2 == 1) { f2(); } }
		 * 
		 * }
		 * 
		 * static void f1() { System.out.println("f1실행중입니다"); }
		 * 
		 * static void f2() { System.out.println("f2실행중입니다");
		 * 
		 * 
		 */

		/* linePrint(10, 'A'); */

		/*
		 * 함수를 만든다 
		 * 함수를 사용한다. 호출한다 
		 * 함수를 호출하는 쪽에서...
		 */
		/*
		 * System.out.println("hello1"); int x = f2(); System.out.println("hello2");
		 */
		
		int result = su1(10);

		if (result == 0) {
			System.out.print("짝수");
		} else {
			System.out.print("홀수");
		}
		
	}

	/*
	 * private static void linePrint(int n, char ch) { char ch = 'a'; for (int i =
	 * 0; i < n; i++) {
	 * 
	 * 
	 * 
	 * System.out.println(ch); System.out.println(10); }
	 * 
	 * }
	 */

	/*
	 * public static void f(int n) { int i =0; while(i<n) {
	 * System.out.println("========================"); i++; } }
	 * 
	 * static int f2() { f(10); return 10; }
	 */
	
	static int su1(int n) {
		if (n % 2 == 0) {

			return 0;
		} else {

			return 1;
		}

	}

}
