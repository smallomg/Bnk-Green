package Baekjoon;

import java.util.Scanner;

public class B2587 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A[] = new int[5];

		int sum = 0;

		int temp = 0;

		for (int i = 0; i < 5; i++) {
			int Num = sc.nextInt();
			A[i] = Num;
			sum += A[i];
		}

		int min = A[0];

		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (A[i] > A[j]) {
					temp = A[j];
					A[j] = A[i];
					A[i] = temp;
				}

			}
		}

		int avg = sum / 5;

		for (int i = 0; i < 5; i++) {
			System.out.println(A[i]);
		}
		System.out.println("\n");
		System.out.println(avg);
		System.out.print(A[2]);
	}

}
