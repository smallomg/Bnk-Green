package Baekjoon.B0x02;

import java.util.Scanner;

public class B10093 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Num1 = sc.nextInt();
		
		int Num2 = sc.nextInt();
		
		
		System.out.println(Num2 - Num1 - 1);
		for(int i = Num1+1;i<Num2;i++) {
			System.out.print(i+" ");
		}

	}

}
