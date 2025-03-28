package vo;

public class Student2 {

	//학생클래스를 작성하시오.
	//학생은 이름, 학년 , 가진 돈을 멤버변수로 가집니다
	//학생은 버스를 탑니다.(학생은 버스를 타다라는 함수가 있습니다)
	//학생은 버스를 탈 때 요금(1000원)을 냅니다
	//학생정보(이름,학년,가진돈)을 콘솔에 출력하는 showinfo 함수가 있습니다
	
	String name;
	int grade;
	int mymoney;
	
	Student2(){
		mymoney = 10000;
	}
	
	void gobus(Student2_Bus bus) {
		//버스를 타면 요금을 낸다.
		mymoney = mymoney - 1000;
		if(mymoney<=1000) {
			System.out.print("돈이 없습니다");
		}
	}
	
	void showinfo() {
		System.out.print("이름\t:\t"+name+"\n"+
				"학년\t:\t"+grade+"\n"+
				"가진돈\t:\t"+mymoney);
		System.out.print("\n");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getMymoney() {
		return mymoney;
	}

	public void setMymoney(int mymoney) {
		mymoney = mymoney;
	}
	
	
	
}
