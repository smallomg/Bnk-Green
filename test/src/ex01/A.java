package ex01;

public class A {
	//public 외부사용가능 접근 가능
	//private 누구든 제한 접근 제한
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
