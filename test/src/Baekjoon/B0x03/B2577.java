package Baekjoon.B0x03;

public class B2577 {

	public static void main(String[] args) {
		int n1 = 150;
		int n2 = 266;
		int n3 = 427;

		int sum = 0;
		int count = 1;

		sum = n1 * n2 * n3;

		System.out.println(sum);
		// 10으로 나누고 그 나눈것 d를 배열 갯수 d로 해서 하나씩 배열에 넣고
		// 그거를 if로 배열 하나당 만들어서 하면 될거 같음

		for (;;) {
			sum = sum / 10;

			count++;
			if (sum / 10 == 0) {
				break;
			}
		}

		System.out.println(count);
		sum = n1 * n2 * n3;

		System.out.println(sum);

		int arr[] = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = sum % 10;
			sum = sum / 10;

			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < count; i++) {
			if (arr[i] == 0) {
				int zero = 0;
				zero++;
			}
			if (arr[i] == 1) {
				int one = 0;
				one++;
			}
			if (arr[i] == 2) {
				int two = 0;
				two++;
			}
			if (arr[i] == 3) {
				int three = 0;
				three++;
			}
			if (arr[i] == 4) {
				int four = 0;
				four++;
			}
			if (arr[i] == 4) {
				int five = 0;
				five++;
			}
			if (arr[i] == 4) {
				int six = 0;
				six++;
			}
		}
	}

}
