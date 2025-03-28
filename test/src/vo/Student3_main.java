package vo;

import java.util.Scanner;

public class Student3_main {

	public static void main(String[] args) {

		Student3 st1 = new Student3("넘버원", 1, 1, 0, 80, 90);
		Student3 st2 = new Student3("넘버투", 2, 2, 70, 70, 70);
		Student3 st3 = new Student3("넘버쓰리", 2, 3, 20, 20, 20);
		Student3 st4 = new Student3("넘버포", 3, 4, 17, 83, 90);
		Student3 st5 = new Student3("넘버파이브", 3, 5, 10, 50, 90);

		st1.Average();
		st2.Average();
		st3.Average();
		st4.Average();
		st5.Average();

		Student3 st[] = new Student3[5];
		Scanner sc = new Scanner(System.in);

		Student3 temp;

		st[0] = st1;
		st[1] = st2;
		st[2] = st3;
		st[3] = st4;
		st[4] = st5;

		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (st[i].avg < st[j].avg) {
					temp = st[i];
					st[i] = st[j];
					st[j] = temp;
				}
			}

		}

		for (;;) {
			System.out.println("[0 : 종료 ]\t[1 : 학생번호조회 ]\t[2 : 성적조회 ]\t[3 : 학생순위조회 ]");
			int start = sc.nextInt();
			
			
			
			if (start == 0) {
				System.out.println("종료합니다");
				break;
			}
			if (start == 1) {
				/* 학생 개별 조회 */
				System.out.println("학생의 번호를 입력해주세요.");
				int inputN = sc.nextInt();

				st1.Indi(inputN);
				st2.Indi(inputN);
				st3.Indi(inputN);
				st4.Indi(inputN);
				st5.Indi(inputN);
			}
			
			if (start == 2) {
				// 성적 조회
				System.out.println(st1);
				System.out.println(st2);
				System.out.println(st3);
				System.out.println(st4);
				System.out.println(st5);
			}
			
			if (start == 3) {
				// 학생순위조회
				System.out.println("1등\t2등\t3등\t4등\t5등\t");
				for (int i = 0; i < 5; i++) {

					System.out.print(st[i].name + "\t");
					
				}
				System.out.print("\n");
			}
		}

	}

}
