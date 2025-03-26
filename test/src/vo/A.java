package vo;

//value object
public class A {
	private int n;
	private String s;

	public void setN(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setS(String s) {
		this.s = s;
	}

	public String getS() {
		return s;
	}

	public String showInfo() {
		return "n = " + n + "s = " + s;
	}

	// 인스턴스의 멤버변수 값등을
	@Override // 어노테이션
	public String toString() {
		return "A[n = " + n + ",s = " + s + "]";
	}
}
