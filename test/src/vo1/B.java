package vo1;

//클래스 B는 인터페이스 IB의 구현체입니다
public class B implements IB{

	@Override
	public void f1() {
		System.out.println("B클래스의 f1함수 실행입니다...");
		
	}

	@Override
	public int f2() {
		System.out.println("B클래스의 f2함수 실행입니다...");
		return 0;
	}
	
}
