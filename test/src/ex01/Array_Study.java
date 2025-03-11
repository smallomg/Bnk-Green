package ex01;

import java.util.Scanner;

public class Array_Study {

	public static void main(String[] args) {
		// A[] 정수 3개 입력받는게 들어감 4번째 입력 A[3] = 100 범위를 초과했습니다 안내문 A[3] A[4] 에러 안나게

		Scanner sc = new Scanner(System.in);

		int A[] = new int[3];
		int B[] = { 100, 1, 2 };

		// 배열의 길이가 다르면 에러 만약 for에 3이 아니고 4이면 에러남 for (int i = 0; i < 3; i++) { int c =
		sc.nextInt();
		A[i] = c; // c는 내가 입력하는 값

		System.out.print("\n");

		for (

				int i = 0; i < 3; i++) {
			System.out.print(A[i] + " ");

		}

		// 배열의 길이가 다르면 에러 A = B;

		System.out.print("\n");

		for (int i = 0; i < 3; i++) {
			System.out.print(A[i] + " ");

		}

		Scanner sc = new Scanner(System.in);
		int A[] = new int[3];
		int B[] = new int[4];

		System.out.println(A);

		for (int i = 0; i < A.length; i++) {
			int c = sc.nextInt();
			A[i] = c;

			B[i] = A[i];
		}
		System.out.println(B);

		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i]);

		}

		int A[] = new int[3];
		int B[] = new int[10];

		for (int i = 0; i < 10; i++) {
			A = B;
			A[i] = 10;
			System.out.println(A[i]);

		}

		int A[] = new int[3];

		for (int i = 0; i < 10; i++) {
			int B[] = new int[A.length + 1];
			A = B;
			A[i] = 10;
			System.out.println(i + 1 + "번째 : " + A[i]);

		}

		int[] A = new int[3];
		for (int i = 0; i < 10; i++) { // A배열을 B배열로 옮기는데 B배열의 크기랑 A배열의 크기랑 다르니까 이렇게 함
			if (i == A.length) {
				int[] B = new int[A.length + 1];
				for (int k = 0; k < A.length; k++) {
					// 3까지 A를 B로 옮김 B[k]=A[k];

				}
				System.out.println(i + 1 + "번째\t:\t" + B[i]);
				A = B; // B에 있는 주소를 A로 옮기면 이제 A배열을 B배열을 찾아감
			}
			A[i] = 10;
			System.out.println(i + 1 + "번째\t:\t" + A[i]);

		}

		
		// 숫자를 입력하세요 1234 입력한 수들의 합 : 10 527 합은 14
		Scanner sc = new Scanner(System.in);

		int A[] = new int[4];

		int sum = 0;

		System.out.print("숫자를 입력하세요:");

		int c = sc.nextInt();

		A[0] = c % 10000 / 1000;
		A[1] = c % 1000 / 100;
		A[2] = c % 100 / 10;
		A[3] = c % 10;
		for (int i = 0; i < 4; i++) {
			sum += A[i];
		}
		System.out.println(A[0]);
		System.out.println(A[1]);
		System.out.println(A[2]);
		System.out.println(A[3]);
		System.out.print("입력한 수의 총합 : " + sum);

	}

}
