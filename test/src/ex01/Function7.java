package ex01;

import java.util.Scanner;

public class Function7 {

	public static void main(String[] args) {

		// 정수 두개 입력 n1 n2
		// calc함수(n1 n2) 리턴값 add저기 애들한테 주기
		// add sub mal div(실수)
		// return값 다시 calc ㄱ
		// 4개의 값을 전부 더한다!
		// 총합을 구해서 그 값을 메인을 돌려주기 화면 출력 1
		

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		calc(n1, n2);
		
	}

	static int calc(int n1, int n2) {
		
		int sum = (int) (add(n1, n2) + sub(n1, n2) + mul(n1, n2) + div(n1, n2));

		System.out.println("n1 + n2 = "+add(n1, n2));
		System.out.println("n1 - n2 = "+sub(n1, n2));
		System.out.println("n1 * n2 = "+mul(n1, n2));
		System.out.println("n1 / n2 = "+div(n1, n2));
		
		if (sum % 2 == 0) {
			System.out.println("짝수입니다");
		} else
			System.out.println("홀수입니다");
		System.out.println("sum의 값은"+sum);
		return sum;

	}

	static int add(int n1, int n2) {
		return n1 + n2;
	}

	static int sub(int n1, int n2) {
		return n1 - n2;
	}

	static int mul(int n1, int n2) {
		return n1 * n2;
	}

	static double div(float n1, float n2) {
		return n1 / n2;
	}

}
