package Baekjoon.B0x02;

import java.util.Scanner;

public class B2576 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = 1;
		int sum = 0;
		int temp = 0;
		int A[] = new int[7];

		for (int i = 0; i < 7; i++) {
			int N = sc.nextInt();

			if (N % 2 == 1) {
				A[i] = N;
				sum += N;
				count++;

			}
			
			
		}

		System.out.println(sum);
		for (int i = 0; i < 7; i++) {
		System.out.println(A[i]);
		}
		System.out.println(A[0]);

	}

}
