package ex03;

public class AAA {
	
	int n;
	static int x;
	static int y;
	
	
	void test() {
		System.out.println("test 입니다");
	}
	
	void nonStaticf() {
		test();
		staticf();
		System.out.println("f 함수 실행..."+x);
	}
	static void staticf() {
		/*
		 * test(); nonStaticf();
		 */
		System.out.println("staicf 함수 실행...");
	}
}
