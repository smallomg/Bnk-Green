package ex01;

public class Up_Low_Text {

	public static void main(String[] args) {
		// 대문자 A = 65
		// +32
		// 소문자 a = 97
		char A[] = { 'a', 'b', 'c', 'd', 'E' };

		Atoa(A);
		System.out.print("\n");
		atoA(A);
	}

	static char[] Atoa(char A[]) {
		// 대문자에서 소문자 + 더하기
		for (int i = 0; i < 5; i++) {
			if (A[i] < 97) {
				A[i] = (char) (A[i] + 32);
			}

			System.out.print(A[i] + " ");

		}
		return A;
	}

	static char[] atoA(char A[]) {
		// 소문자에서 대문자 - 더하기
		for (int i = 0; i < 5; i++) {
			if (A[i] >= 97) {
				A[i] = (char) (A[i] - 32);
			}

			System.out.print(A[i] + " ");

		}
		return A;

	}

}
