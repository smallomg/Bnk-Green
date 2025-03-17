package Baekjoon.B0x02;

import java.util.Scanner;

public class B2309 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A[] = new int[9];
		int B[] = new int[9];
		int temp = 0;
		int sum = 0;

		for (int i = 0; i < 9; i++) {
			int Num = sc.nextInt();

			A[i] = Num;

			sum += A[i];
		}

		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (A[i] > A[j]) {
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}

			}
			
		}

		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (sum - (A[i] + A[j]) == 100) {
					A[i] = 0;
					A[j] = 0;
				}
			}
			if(!(A[i]==0)) {
				B[i] = A[i];
			}
			
		}

		
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (B[i] > B[j]) {
					temp = B[i];
					B[i] = B[j];
					B[j] = temp;
				}

			}
			
			
		}

		for (int i = 2; i < 9; i++) {
			System.out.println(B[i]);
		}
		
	}
}
