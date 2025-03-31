package vo;

public class AA {
	int n;

	void f() {
		System.out.println("AA함수 실행");
	}

	void fa() {
		System.out.println("A클래스의 fa함수 실행");
	}
	AA(){
		
	}
	AA(int n) {
		this.n = n;
		
		System.out.println("AA생성자 실행");
	}
}
