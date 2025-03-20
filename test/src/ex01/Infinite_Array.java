package ex01;

import java.util.Scanner;

public class Infinite_Array {

	public static void main(String[] args) {
		// 무한 배열
		Scanner sc = new Scanner(System.in);

		int lastNum = sc.nextInt();

		int A[] = new int[lastNum];
		int B[] = new int[lastNum + 1];

		for (;;) {
			int count = 0;
			for (int i = 0; i < lastNum; i++) {
				B[i] = A[i];
				System.out.print(B[i] + " ");
			}
			if (count == lastNum)
				break;
			count++;

		}

	}

}
