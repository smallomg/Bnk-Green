package ex01;

public class Selection_Sort {

	public static void main(String[] args) {

		/* 선택 정렬 */
		int arr[] = { 5, 6, 2, 1, 4, 3 };
		int temp = 0;

		for (int i = 0; i < 6; i++) {

			for (int j = i + 1; j < 6; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
			
			for (int k = 0; k < 6; k++) {
				System.out.print(arr[k] + " ");

			}
			System.out.print("\n");

		}

		System.out.print("\n");

		for (int i = 0; i < 6; i++) {
			System.out.print(arr[i] + " ");

		}
	}

}
