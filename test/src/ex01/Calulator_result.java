package ex01;

import java.util.Scanner;

public class Calulator_result {

	public static void main(String[] args) {
		// 멤버변수 정수형 2개
		// 사칙연산 멤버함수
		// 4개 함수
		// 계산기
		
		Calulator ca = new Calulator();
		
		Scanner sc =new Scanner(System.in); 
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println("합\t"+ca.add(n1, n2));
		System.out.println("차\t"+ca.sub(n1, n2));
		System.out.println("곱\t"+ca.mul(n1, n2));
		System.out.println("나눔\t"+ca.div(n1, n2));

	}

}
