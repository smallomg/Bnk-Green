package ex01;

public class A {
	int n;
	String s;

	void f() {
		int x  = f2();
		System.out.println(n + " " + s);

	}

	int f2() {
		return n;
	}
}
