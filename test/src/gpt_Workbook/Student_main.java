package gpt_Workbook;

public class Student_main {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		
		st1.name ="이름1";
		st1.age=13;
		st1.grade=1;
		st2.name ="이름2";
		st2.age=1;
		st2.grade=1;
		st3.name ="이름3";
		st3.age=25;
		st3.grade=1;
		st1.printStudentInfo();
		System.out.println("");
		st2.printStudentInfo();
		System.out.println("");
		st3.printStudentInfo();
		
		st1.incremenAge();
		st2.incremenAge();
		st3.incremenAge();
		
		System.out.println("==========1살 증가 후==========");
		st1.printStudentInfo();
		System.out.println("");
		st2.printStudentInfo();
		System.out.println("");
		st3.printStudentInfo();
	}

}
