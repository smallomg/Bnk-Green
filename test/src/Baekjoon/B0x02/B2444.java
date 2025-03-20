package Baekjoon.B0x02;

import java.util.Scanner;

public class B2444 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int star = sc.nextInt();

		for (int i = 0; i < star; i++) {
			
			for (int j = star; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.print("*");

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for (int i = 1; i <= star; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = star; j > i; j--) {
				System.out.print("*");
			}

			System.out.print("*");
			for (int j = star; j > i; j--) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}

	}

}
