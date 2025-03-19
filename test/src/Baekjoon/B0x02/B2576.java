package Baekjoon.B0x02;

import java.util.Scanner;

public class B2576 {
	public static void main(String[] args) {

		//모름
		Scanner sc = new Scanner(System.in);

		int A[] = new int[7];

		int count = 0;
		int sum = 0;
		int min = A[0];

		for (int i = 0; i < 7; i++) {
			int N = sc.nextInt();
			
			System.out.print(N + "\t");
			
			if (N % 2 == 1) {
				
				sum += N;
				count++;
				A[i] = N;
			}
			System.out.print(A[i] + "\t");
		}
		System.out.print("\n");
		
		int B[] = new int[count];
		for (int i = 0; i < count; i++) {
			
			if (B[i] < min) {
				min = B[i];
			}
			System.out.print(B[i] + "\t");
		}
		
		
		System.out.print("\n");
		System.out.println(sum);
		System.out.print(min);

	}

}
