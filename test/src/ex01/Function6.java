package ex01;

public class Function6 {

	public static void main(String[] args) {
		int n = 5;
		int m = 10;
		int k = 20;

		int B[] = g(f(n, m, k));
		System.out.println((f(n, m, k)));
		System.out.println(B[0]);
		System.out.println(B[1]);
	}

	static int f(int n, int m, int k) {
		int A[] = new int[3];
		int sum = 0;
		A[0] = n;
		A[1] = m;
		A[2] = k;
		for (int i = 0; i < 3; i++) {
			sum += A[i];
		}
		return sum;

	}

	static int[] g(int n) {
		int B[] = new int[2];
		B[0] = n / 3;
		B[1] = n % 3;

		return B;
	}
}
