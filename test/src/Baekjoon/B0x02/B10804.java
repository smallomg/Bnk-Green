package Baekjoon.B0x02;

import java.util.Scanner;

public class B10804 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int card[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int temp = 0;

		for (int j = 0; j < 10; j++) {
			int Num1 = sc.nextInt();
			int Num2 = sc.nextInt();

			for (int i = 0; i < (Num2 - Num1 + 1) / 2; i++) {
				temp = card[Num1 - 1 + i];
				card[Num1 - 1 + i] = card[Num2 - 1 - i];
				card[Num2 - 1 - i] = temp;
			}
		}

		for (int i = 0; i < 20; i++) {
			System.out.print(card[i] + " ");

		}

	}

}
