package ex01;

public class A_test {

	public static void main(String[] args) {

		/* 생성자 인스턴스 */
		/* 인스턴스 기본 출력값 0 null */
		A a = new A();
		A a2 = new A();

		int result = a.f2();
		System.out.println(a.f2());
		a.n = 5;
		a2.n = 10;
		a.s = "hello";

		System.out.println(a.f2());
		a.f();
		System.out.println(a.n);
		System.out.println(a.s);
		
		
	}

}
