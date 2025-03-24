package ex01;

import java.util.Scanner;

public class Student_test {
	public static void main(String[] args) {
		// 1.학생 3명의 인스턴스를 만든다
		// 2.1번을 활용해서 학생 배열을 만드시오
		// 3.학생들의 국어점수 합계를 구하시오

		Scanner sc = new Scanner(System.in);
	
		Student arr[] = new Student[3];

		int sum = 0;

		for (int i = 0; i < 3; i++) {
			Student st = new Student();

			st.no = sc.nextInt();
			st.name = sc.nextLine();
			st.kor = sc.nextInt();

			arr[i] = st;
			sum += arr[i].kor;
			System.out.print(arr[i].no);
			System.out.print(arr[i].name);
			System.out.print(arr[i].kor);
			
			arr[i].showStudentInfo();
		}

		//st.showStudentInfo();
		System.out.print(sum);
	}
}
