package Baekjoon.B0x02;

import java.util.Scanner;

public class B9498 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();

		if (90 <= P && P <= 100) {
			System.out.print("A");
		}

		else if (80 <= P && P < 90) {
			System.out.print("B");
		}

		else if (70 <= P && P < 80) {
			System.out.print("C");
		}

		else if (60 <= P && P < 70) {
			System.out.print("D");
		} 
		else {
			System.out.print("F");
		}

	}

}
