package vo1;

import java.util.Arrays;

public class MyintArray {
	// 기본생성자를 써서
	// 멤버변수를 써서 5개를 저장할수 있는 멤버변수 할당
	// 배열의 요소에 get역할을 하는 메소드를 만들고 매개변수는 필요함
	// 배열의 요소에 set역할을 하는 메소드를 만들고 매개변수는 필요함
	// 배열에 모든값을 출력해주는 함수 만들기
	private int[] arr;
	

	MyintArray() {
		//배열을 생성해서 인스턴스를 해라
		arr = new int[5];
		
	}



	public int getArr(int x) {
		
		return arr[x];
	}

	public void setArr(int i,int x) {
		this.arr[i] = x;
		
	}

	public void f() {
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]+" ");
		}
	}

}
