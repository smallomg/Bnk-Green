package Interface;

enum Human3 {
	MAN, WOMAN;

	private Human3() {
		System.out.println("Human constructor called...");
	}
}

public class EnumConstructorTest {

	public static void main(String[] args) {
		System.out.println(Human3.MAN);
		System.out.println(Human3.WOMAN);
	}

}
