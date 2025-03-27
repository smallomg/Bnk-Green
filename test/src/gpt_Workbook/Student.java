package gpt_Workbook;
/*문제 설명: 학생의 정보를 저장하는 Student 클래스를 작성하세요. 이 클래스는 다음과 같은 속성을 가집니다:

name (학생 이름)

age (학생 나이)

grade (학생 학년)

또한, 다음과 같은 메서드를 작성하세요:

1.학생 정보를 출력하는 메서드: printStudentInfo()

2.학생의 나이를 1살 증가시키는 메서드: incrementAge()

그 후, Main 클래스에서 Student 객체를 3명 생성하고 각 학생의 정보를 출력한 뒤, 나이를 1살 증가시키고 다시 출력하세요.*/
public class Student {

	String name;
	int age;
	int grade;
	
	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return name;
	}
	void setAge(int age) {
		this.age = age;
	}
	int getAge() {
		return age;
	}
	void setGrade(int grade) {
		this.grade=grade;
	}
	int getGrade() {
		return grade;
	}
	
	
	void printStudentInfo(){
		System.out.println("이름:\t"+name);
		System.out.println("나이:\t"+age);
		System.out.println("학년:\t"+grade);
	}
	
	int incremenAge(){
		age++;
		return age;
	}
	
	
}
