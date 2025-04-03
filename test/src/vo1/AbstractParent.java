package vo1;

public abstract class AbstractParent {

	int n;

	public AbstractParent() {
		System.out.println("AbstactParent 생성자 실행");
	}

	public AbstractParent(int n) {
		this.n = n;
	}

	public void f() {
		System.out.println("f()함수 실행");
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getN() {
		return n;

	}

	public abstract void af();
}
