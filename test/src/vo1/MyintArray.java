package vo1;

public class MyintArray {
	// 기본생성자를 써서
	// 멤버변수를 써서 5개를 저장할수 있는 멤버변수 할당
	// 배열의 요소에 get역할을 하는 메소드를 만들고 매개변수는 필요함
	// 배열의 요소에 set역할을 하는 메소드를 만들고 매개변수는 필요함
	// 배열에 모든값을 출력해주는 함수 만들기
	private int[] arr = { 1, 2, 3, 4, 5 };
	int brr[];

	int[] add(int n) {
		brr = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			brr[i] = arr[i];

		}

		brr[arr.length] = n;

		arr = brr;
		System.out.println("배열에 " + n + "이 추가되었습니다.");
		return arr;
	}

	void f() {
		System.out.println("===========배열===========");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("=========================");
		System.out.println();
	}

	int[] delete(int i) {
		int temp = 0;
		for (int k = i; k < arr.length - 1; k++) {
			temp = arr[k];
			arr[k] = arr[k + 1];
			arr[k + 1] = temp;
		}
		brr = new int[arr.length - 1];

		for (int k = 0; k < arr.length - 1; k++) {

			brr[k] = arr[k];
		}

		arr = brr;
		System.out.println("인데스 " + i + "이 삭제되었습니다.");
		return arr;

	}

}
