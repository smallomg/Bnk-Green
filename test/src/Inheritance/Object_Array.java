package Inheritance;

class A {
	private int n;
	private String s;

	public A(int n, String s) {
		this.n = n;
		this.s = s;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

}

class B {
	private float f;
	private char c;

	public B(float f, char c) {
		this.f = f;
		this.c = c;
	}

	public float getF() {
		return f;
	}

	public void setF(float f) {
		this.f = f;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

}

public class Object_Array {

	public static void main(String[] args) {
		// Object의 성격 알기 - Object 클래스는 모든 클래스의 부모이다
		// 상속관계에서 자식들은 타입이 다를 수 있다.
		// 타입이 다르다는건 배열을 만들 수 없다는 의미이다
		// 부모타입으로 선언한 배열을 자식 타입들이 들어갈 수 없다
		// 결과적으로 상속관계는 부모타입으로 서로다른 자식 타입을 하나로 묶을 수 있다는 뜻이다

		Object[] obj1 = new Object[3];

		obj1[0] = "hello";
		obj1[1] = new A(1, "jame");
		obj1[2] = new B(2.3f, 'b');

		Object[] obj2 = new Object[obj1.length + 3];
		obj2[0] = obj1[0];
		obj2[1] = obj1[1];
		obj2[2] = obj1[2];

		obj1 = obj2;

		obj1[3] = "good";
		obj1[4] = new A(2, "Ann");
		obj1[5] = new B(3.3f, 'C');
		for (int i = 0; i < obj1.length; i++) {
			System.out.println(obj1[i]);
		}

		/*
		 * String s = (String) obj1[0]; System.out.println(s);
		 * 
		 * int n = a.getN(); String name = a.getS();
		 * 
		 * A ra = (A) obj1[1]; int n1 = ra.getN(); String s1 = ra.getS();
		 */
	}

}
