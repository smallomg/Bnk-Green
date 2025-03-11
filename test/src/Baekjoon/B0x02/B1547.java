package Baekjoon.B0x02;

import java.util.Scanner;

public class B1547 {

	public static void main(String[] args) {

		int A[] = { 1, 2, 3 };
		int temp = 0;

		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();

		for (int i = 0; i < M; i++) {
			int X = sc.nextInt() - 1;
			int Y = sc.nextInt() - 1;

			temp = A[X];
			A[X] = A[Y];
			A[Y] = temp;

		}
		System.out.print(A[0]);

	}

}
