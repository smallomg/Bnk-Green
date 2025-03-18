package Baekjoon.B0x02;

import java.util.Scanner;

public class B1267 {

	public static void main(String[] args) {

		//모름
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int A[] = new int[N];

		int sumY = 10;
		int sumM = 15;

		for (int i = 0; i < N; i++) {
			int T = sc.nextInt();
			A[i] = T;

		}

		// Y
		for (int i = 0; i < N; i++) {

			if (A[i] >= 30) {

				sumY += 20;
			}

			if (A[i] > 30) {
				sumY += 10;
			}

		}

		for (int i = 0; i < N; i++) {
			if (A[i] >= 60) {

				sumM += 30;
			}
			
			
			if (A[i] > 60 ) {
				sumM += 15;
			}

			
		}

		if (sumM > sumY) {
			System.out.print("Y " + sumY);
		}
		if (sumM < sumY) {
			System.out.print("M " + sumM);
		}
		if (sumM == sumY) {
			System.out.print("Y M " + sumM);
		}

		System.out.print("\n");
		System.out.print(sumM);
		System.out.print(sumY);
	}

}
