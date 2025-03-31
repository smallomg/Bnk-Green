package vo;

public class C {

	public static void main(String[] args) {
		
		System.out.println("AA생성자 결과");
		AA aa = new AA();
		System.out.print("\n");
		
		System.out.println("AA함수 결과");
		aa.f();
		System.out.print("\n");
		
		System.out.println("B생성자 결과");
		B b = new B();
		System.out.print("\n");
		
		System.out.println("B함수 결과");
		b.f();
		System.out.print("\n");
		
		System.out.println("부모 타입의 자료형에 자식의 생성자 결과");
		AA aab = new B();
		System.out.print("\n");
		
		B bb = (B)aab;
	
		aa.fa();
		b.fa();
		aab.fa();
		
	}

}
