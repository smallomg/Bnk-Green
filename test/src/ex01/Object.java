package ex01;

public class Object {
	/*
	 * 반환자료형 함수이름 (함수입력부){ 기능정의 return 피드백 }
	 */

	public static void main(String[] args) {

		/*
		 * int s = add3(10); System.out.print(s);
		 */

		/* f1(); */

		/* f2(3); */

		// 메인함수는 칼큘레이터 함수 2개의 함수 덧셈 뺄쌤 나눔쌤 곱셉 메인한테 돌려주는게 아니라 하나에다가 출력하고 난 뒤에 main함수가
		// 종료합니다 안내문

		calculator(6, 3);

	}

	/*
	 * public static int add3(int r) { return r = r+3; }
	 */

	/*
	 * static void f1() { System.out.print("f1함수 실행"); }
	 */

	/*
	 * static void f2(int n) { System.out.print(n);
	 * 
	 * }
	 */

	static int f3(int n, int n2) {

		return n + n2;

	}

	static int f4(int n, int n2) {

		return n - n2;

	}

	static int f5(int n, int n2) {

		return n * n2;

	}

	static int f6(int n, int n2) {

		return n / n2;

	}

	static void calculator(int n, int n2) {
		System.out.println(f3(6, 3));
		System.out.println(f4(6, 3));
		System.out.println(f5(6, 3));
		System.out.println(f6(6, 3));
	}

}
