package vo;

public class B extends AA {

	int k;

	void f() {
		System.out.println("B함수 실행");
	}
	@Override
	public void fa() {
		System.out.println("B클래스의 fa함수 실행");
	}
	
	B() {
		super(10);
		System.out.println("B생성자 실행");
	
	}
	B(int k){
		this.k=k;
	}
}
