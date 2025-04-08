package Inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_main {

	public static void main(String[] args) {

		Student s1 = new Student("James", 93);
		Student s2 = new Student("Ann", 95);
		Student s3 = new Student("Candy", 100);
		Student s4 = new Student("Bruce", 64);
		Student s5 = new Student("Ben", 56);

		Student[] students = new Student[5];

		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

		ArrayList<Student> sList = new ArrayList<>();
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		sList.add(s5);
		System.out.println(sList);

		int count = 0;
		for (int i = 0; i < sList.size(); i++) {
			Student result = sList.get(i);
			if (sList.get(i).getScore() < 60) {
				count++;
			}

			System.out.println(result);
		}
		System.out.println("낙제한 학생의 수 " + count);

		for (Student stu : sList) {
			System.out.println(stu);
		}

		// 학생이 번호와 이름이 일치하면 점수를 알려줌
		// 프로그램이 시작되면 번호와 이름을 입력하세요
		// 해당사항이 없으면 출력 번호와 이름을 확인하세요
		// 1번 제임스를 입력했으면 점수를 알려줌

		Scanner sc = new Scanner(System.in);
		System.out.println("번호와 이름을 입력해주세요");

		int num = sc.nextInt();
		String name = sc.next();

		Student_Array sa = new Student_Array(sList, num, name);
		sa.saScore();
	}

}
