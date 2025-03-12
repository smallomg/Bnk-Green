package Baekjoon.B0x02;

import java.util.Scanner;

public class B2753 {

	public static void main(String[] args) {
		//윤년계산기
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if(year%4==0||!(year%100==0)&&year%4==0||year%400==0) {
			
			year=1;
		}
		else {
			year=0;
		}
		System.out.print(year);
	}

}
