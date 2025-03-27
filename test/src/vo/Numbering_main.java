package vo;

//번호가 있음 인스턴스 생성할때 자동으로 고유번호 부여
//실행 클래스 메인 
//메모리에 인간이 몇개 만들어 졌는지 확인하는 기능
public class Numbering_main {

	public static void main(String[] args) {

		Numbering n1 = new Numbering();
		Numbering n2 = new Numbering();
		Numbering n3 = new Numbering();

		// 남자 인스턴스 4 여자 인스턴스 6
		// 이거를 배열에 넣자
		// 출력문 남자는 몇명여자는 몇명

		System.out.println(n1.getId());
		System.out.println(n2.getId());
		System.out.println(n3.getId());

		Numbering n4 = new Numbering('남');
		Numbering n5 = new Numbering('남');
		Numbering n6 = new Numbering('남');
		Numbering n7 = new Numbering('남');

		Numbering n8 = new Numbering('여');
		Numbering n9 = new Numbering('여');
		Numbering n10 = new Numbering('여');
		Numbering n11 = new Numbering('여');
		Numbering n12 = new Numbering('여');
		Numbering n13 = new Numbering('여');

		// 클래스는 자료형이다!! 배열로도 사용 가능
		Numbering[] arr = new Numbering[10];

		arr[0] = n4;
		arr[1] = n5;
		arr[2] = n6;
		arr[3] = n7;
		arr[4] = n8;
		arr[5] = n9;
		arr[6] = n10;
		arr[7] = n11;
		arr[8] = n12;
		arr[9] = n13;

		Numbering_Function n14 = new Numbering_Function();
		
		n14.f(arr);
		
		Numbering_Function.f2(arr);
	}// main 끝

	

}
