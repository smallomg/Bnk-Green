package ex03;

public class AAA_main {
	
	public static void main(String[] args) {

		/*
		 * AAA a= new AAA(); a.n =10; System.out.println(a.n);
		 * 
		 * a.x=20;
		 * 
		 * AAA.x=30; System.out.println(AAA.x);
		 */
		AAA a= new AAA();
		
		a.nonStaticf();
		AAA.staticf();
		AAA.x = 10;
		System.out.print("\n");
		a.nonStaticf();
		AAA.staticf();
	}

}
