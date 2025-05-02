package test;

public class B {
	private static B instance = new B();

	B() {
	}

	public static B getIntstance() {

		return instance;
	}

}
