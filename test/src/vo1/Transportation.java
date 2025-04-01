package vo1;

public class Transportation{

	//final 상수로 쓰임 최종착 상속이 안된다 오버라이딩이 안된다 
	
	//상속은 가능한데 인스턴스를 생성할수 없다
	//상속을 받은 추상메소드는 자식클래스에서 구현해야한다
	//	public abstract void go();
	
	public void go() {
		System.out.print("알아서 갑니다");
	}
	
	
	public void goBusan(Transportation transportation) {
		transportation.go();
	}
}
