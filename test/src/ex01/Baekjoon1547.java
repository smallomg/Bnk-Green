package ex01;

import java.util.Scanner;

public class Baekjoon1547 {

	public static void main(String[] args) {

		int A[] = { 1, 2, 3 };
		int B[] = new int[3];
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			A[X] = A[Y];
			A[Y] = A[X];

		}

		System.out.print(A[0]);

	}

}
