package ex01;

public class Binary {

	public static void main(String[] args) {

		// 10진수를 2진수로

		int n = 100;

		
		int arr[] = new int[10];
		int brr[] = new int[10];

		
		j10to2(n);
		System.out.print("\n");
		j10to8(n);
		System.out.print("\n");
		j10to16(n);

	}
	
	static int[] j10to2(int n) {
		int arr[] = new int[10];
		int brr[] = new int[10];
		for (;;) {

			for (int i = 0; i < 10; i++) {

				arr[i] = n;
				n = n / 2;
				
			}

			if (arr[9]==0) {
				break;
			}
			
		}
		

		for (int i = 0; i < 10; i++) {
			brr[i] = arr[i] % 2;

		}

		for (int i = 9; i >= 0; i--) {
			System.out.print(brr[i] + " ");
		}
		return brr;
		}
	
	static int[] j10to8(int n) {
		int arr[] = new int[10];
		int brr[] = new int[10];
		for (;;) {

			for (int i = 0; i < 10; i++) {

				arr[i] = n;
				n = n / 8;
				
			}

			if (arr[9]==0) {
				break;
			}
			
		}
		

		for (int i = 0; i < 10; i++) {
			brr[i] = arr[i] % 8;

		}

		for (int i = 9; i >= 0; i--) {
			System.out.print(brr[i] + " ");
		}
		return brr;
		}
	
	static int[] j10to16(int n) {
		int arr[] = new int[10];
		int brr[] = new int[10];
		for (;;) {

			for (int i = 0; i < 10; i++) {

				arr[i] = n;
				n = n / 16;
				
			}

			if (arr[9]==0) {
				break;
			}
			
		}
		

		for (int i = 0; i < 10; i++) {
			brr[i] = arr[i] % 16;

		}

		for (int i = 9; i >= 0; i--) {
			System.out.print(brr[i] + " ");
		}
		return brr;
		}
	
	

}
