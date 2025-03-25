package ex02;

import java.util.Scanner;

public class Student {
	// 멤버변수를 3개... 번호, 이름, 성별

	int no;
	String name;
	char gender; // 남자: M, 여자: F

	// 생성자는 해당 클래스에 인스터스가 만들어질때 클래스의 멤버변수를 초기화한다

	// 기본 생성자
	Student() {
	}

	// this는 생성된 인스턴스를 말함
	Student(int no, String name) {
		this.no = no;
		this.name = name;

	}

	// 직접 필요에 따라 만들어 쓰는 생성자
	// 매개변수가 3개인 생성자 1.번호 2.이름 3. 성별
	Student(int n, String na, char g) {// int n,String na,char g 이게 매개변수
		// 매개변수를 멤버변수에 대입한다.
		no = n;
		name = na;
		/* this(n,na); */
		gender = g;
	}

	// 함수의 시그니처
	// 반환타입
	// 매개변수
	// 함수이름

	// 함수의 이름이 같은데 시그니처를 다르면? 함수의 메소드오버로딩
	void f() {
	}

	void f(int x) {
	}

	void f(float y) {
	}

	void f(int z, float b) {
	}

	// 학생의 번호를 바꿀수 있는 함수
	//(setter) 멤버변수의 값을 할당해주는 역할
	// 내가 만든거
	int NC() {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		this.no = a1;
		return this.no;
	}

	// 선생님이 만든거
	void setNo(int n) {
		no = n;
	}
	
	
	//현재 인스턴스 번호 이름 성별 리턴함수 만들기
	//(getter) 멤버변수의 값을 외부로 반환해주는 역할
	int reNo() {
		return no;
	}
	String reSt() {
		return name;
	}
	char reGd( ) {
		return gender;
	}
}
