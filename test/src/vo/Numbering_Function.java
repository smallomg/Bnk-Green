package vo;

public class Numbering_Function {
	void f(Numbering[] arr) {

		int mcount = 0;
		int fcount = 0;

		for (int i = 0; i < 10; i++) {
			if (arr[i].getGender() == '남') {
				mcount++;
			}
			if (arr[i].getGender() == '여') {
				fcount++;
			}
			System.out.print(arr[i].getGender() + " ");

		}

		System.out.print("\n");
		for (int i = 0; i < 10; i++) {

			if (arr[i].getId() == 4) {
				System.out.print(arr[i].getGender());
			}
		}

		System.out.print("\n");
		System.out.println("남자 수: " + mcount + "\t여자 수: " + fcount);
		System.out.println("인간 총 인구 수:" + Numbering.cnt);

	}

	public static void f2(Numbering[] arr) {

		int mcount = 0;
		int fcount = 0;

		for (int i = 0; i < 10; i++) {
			if (arr[i].getGender() == '남') {
				mcount++;
			}
			if (arr[i].getGender() == '여') {
				fcount++;
			}
			System.out.print(arr[i].getGender() + " ");

		}

		System.out.print("\n");
		for (int i = 0; i < 10; i++) {

			if (arr[i].getId() == 4) {
				System.out.print(arr[i].getGender());
			}
		}

		System.out.print("\n");
		System.out.println("남자 수: " + mcount + "\t여자 수: " + fcount);
		System.out.println("인간 총 인구 수:" + Numbering.cnt);

	}
}
