package Inheritance;

public class InfinityObjectArray {

	private Object[] objs;

	public InfinityObjectArray() {
		objs = new Object[3];
	}

	// objs 배열에데이터를 추가하는 기능의 메소드
	int idx = 0;

	public void add(String s) {
		// 배열의 물리적 크기의 끝에 도달하면 에러가 남
		// 물리적 크기의 끝에 도달했을 때 새로운 배열을 만들어서
		// 그 배열에 넣으면 되지 않을까?
		// 만약에 현재 인덱스 값(i)이 배열의 크기(3)와 같으면?
		if (idx == objs.length) {
			Object temp[] = new Object[objs.length + 3];
			for (int i = 0; i < objs.length; i++) {
				temp[i] = objs[i];
			}

			objs = temp; // 주소값이 같아짐
		}
		objs[idx] = s;
		idx++;

	}

	public void showArray() {
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i]);
		}
	}

}
