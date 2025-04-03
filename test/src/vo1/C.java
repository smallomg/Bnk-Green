package vo1;

public class C implements IB{
	@Override
	public void f1() {
		System.out.println("C클래스의 f1함수 실행입니다...");
		
	}

	@Override
	public int f2() {
		System.out.println("C클래스의 f2함수 실행입니다...");
		return 0;
	}
}
