package Baekjoon.B0x02;

import java.util.Scanner;

public class B2490 {

	public static void main(String[] args) {

		int A[] = new int[4];
		Scanner sc = new Scanner(System.in);

		int count = 0;

		int temp[] = new int[3];
		for (int j = 0; j < 3; j++) {

			for (int i = 0; i < 4; i++) {
				int n = sc.nextInt();

				A[i] = n;

				if (A[i] == 1) {
					count++;
				}

			}

			temp[j] = count;
			count = 0;
		}
	
		for(int i = 0; i<3;i++) {
		// 윷
		if (temp[i] == 0) {
			System.out.println("D");
		}
		// 모
		if (temp[i] == 4) {
			System.out.println("E");
		}
		// 걸
		if (temp[i] == 1) {
			System.out.println("C");
		}
		// 개
		if (temp[i] == 2) {
			System.out.println("B");
		}
		// 도
		if (temp[i] == 3) {
			System.out.println("A");
		}
		}
	}

}
