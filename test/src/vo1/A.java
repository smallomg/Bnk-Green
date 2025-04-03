package vo1;

public class A extends AbstractParent{

	
	public A(int n){
		super(n);
		System.out.println("A생성자 실행");
	}
	
	
	@Override
	public
	void af() {
		System.out.println("오버라이드된 af함숨");
		
	}

	
	
}
