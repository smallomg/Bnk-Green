package collection;

public class Outer1 {

	private int speed = 10;

	// outer1클래스만 필요하다 내부클래스
	// 클래스안의 클래스 : 내부클래스
	// 외부클래스가 내부클래스를 아주 필요로 하는 관계
	class MemberInner1 {
		public void move() {
			System.out.printf("인간형 유닛의 %d로 이동합니다\n", speed);
		}
	}

	public void getUnit() {
		MemberInner1 inner = new MemberInner1();
		inner.move();
	}
}
