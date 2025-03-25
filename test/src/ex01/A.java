package ex01;

public class A {
	//public 외부사용가능
	//private 접근 불가
	public int n;
	String s;

	void f() {
		int x  = f2();
		System.out.println(n + " " + s);

	}

	int f2() {
		return n;
	}
}
