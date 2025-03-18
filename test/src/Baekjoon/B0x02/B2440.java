package Baekjoon.B0x02;

import java.util.Scanner;

public class B2440 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int star = sc.nextInt();

		for (int i = 0; i <= star; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
