package vo1;

public class IB_main {

	public static void main(String[] args) {

		/*
		 * 인터페이스는 인스턴스 생성 안됨 IB ib = new IB();
		 */

		/*
		 * 인터페이스의 인스턴스를 생성하기 위해서는 인터페이스는 부모클래스가 되면 됨
		 */
		IB ib1 = new B();
		IB ib2 = new C();

		IB ib[] = new IB[2];
		ib[0] = ib1;
		ib[1] = ib2;

		for (int i = 0; i < ib.length; i++) {
			ib[i].f1();
			ib[i].f2();
		}

	}

}
