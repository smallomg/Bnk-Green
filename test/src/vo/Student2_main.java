package vo;

public class Student2_main {

	public static void main(String[] args) {

		Student2 st1 = new Student2();
		Student2 st2 = new Student2();
		Student2 st3 = new Student2();
		Student2_Bus sb1 = new Student2_Bus(205);
		Student2_Bus sb2 = new Student2_Bus(1);

		System.out.println("=========학생 정보=========");
		System.out.println("st1의 객체의 학생");
		st1.showinfo();
		System.out.println("==========================");
		System.out.println("st2의 객체의 학생");
		st2.showinfo();
		System.out.println("==========================");
		System.out.println("\n");

		st1.gobus(sb1);
		st2.gobus(sb1);
		st2.gobus(sb2);

		System.out.println("버스 타고 결제한 후");
		System.out.println("st1의 객체의 학생");
		st1.showinfo();
		System.out.println("==========================");
		System.out.println("st2의 객체의 학생");
		st2.showinfo();
		System.out.println("==========================");
		System.out.println("\n");
		
		sb1.take(st1);
		sb1.take(st2);
		sb1.take(st3);
		sb2.take(st2);
		
		System.out.println("==========버스 정보==========");
		sb1.showinfo();
		sb2.showinfo();

	}

}
