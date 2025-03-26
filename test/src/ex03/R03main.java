package ex03;

import vo.A;

// ctrl + shift + o
public class R03main {

	public static void main(String[] args) {

		A a = new A();

		/* a.n=10; */

		a.setN(10);
		a.setS("aaa");

		System.out.println(a.showInfo());
		System.out.println(a);

	}

}

//