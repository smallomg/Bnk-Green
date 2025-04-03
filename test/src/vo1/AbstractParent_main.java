package vo1;

public class AbstractParent_main {

	public static void main(String[] args) {

		A a = new A(20);
		System.out.println(a.getN());
		
		System.out.println("=======================================");
		
		AbstractParent ap = new A(10);
		System.out.println(ap.n);
	}

}
