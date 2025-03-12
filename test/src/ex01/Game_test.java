package ex01;

import java.util.Scanner;
import java.util.Random;

public class Game_test {

	public static void main(String[] args) {

		// 주사위 게임 1~6까지 몇개 나왔는지 횟수 통계
		/*
		 * Random rd = new Random();
		 * 
		 * int n1=0;
		 * 
		 * int n = 0; int A[] = new int[6];
		 * 
		 * for (int i = 0; i < 100; i++) { int com = rd.nextInt(6) + 1; A[com -1]++; }
		 * 
		 * for(int i = 0; i<A.length;i++) { System.out.print(A[i]+ " "); }
		 */

		/*
		 * Random rd = new Random();
		 * 
		 * int n1 = 0;
		 * 
		 * int n = 0; int A[] = new int[6];
		 * 
		 * for (int i = 0; i < 10; i++) { int com = rd.nextInt(6) + 1; A[com - 1]++; }
		 * 
		 * 
		 * for (int i = 0; i < A.length; i++) { switch(i+1) { case 1:
		 * System.out.println("1의 횟수는 ? : "+A[0]);break; case 2:
		 * System.out.println("2의 횟수는 ? : "+A[1]);break; case 3:
		 * System.out.println("3의 횟수는 ? : "+A[2]);break; case 4:
		 * System.out.println("4의 횟수는 ? : "+A[3]);break; case 5:
		 * System.out.println("5의 횟수는 ? : "+A[4]);break; case 6:
		 * System.out.println("6의 횟수는 ? : "+A[5]);break; }
		 * 
		 * 
		 * }
		 */

		
		
		// 호텔 예약시스템 10개의 방이있음 예약이 안되있는 상태로 시작함 화면에는 지금 예약 현황을 보여줌 예약이 안되있으면 0 되있으면 1
		// 몇번방을 예약하시겠습니까?
		// 1넣고 엔터 치면 현황이 뜨고
		// 몇번방을 예약하시겠습니까?
		// 반복
		// 이미 예약방을 예약되있는 방을 예약하겠다 하면 예약되있는 방입니다 안내문
		// 언젠간 10개방을 다 예약하면 만실입니다 안내문
		// 더이상 예약 x 종료

		Scanner sc = new Scanner(System.in);
		int count =0;
		
		int h[] = new int[10];

		for (;;) {
			int i = 0;
			
			System.out.println("몇번 방을 예약하시겠습니까?");

			int HN = sc.nextInt();
			if (h[HN - 1] == 0) {
				h[HN - 1] = 1;
				System.out.println("네 예약했습니다");
				System.out.println("현재 예약 현황표");
				System.out.println("1\t2\t3\t4\t5\t6\t7\t8\t9\t10");
				count++;

			} else if (h[HN - 1] == 1) {
				System.out.println("이미 예약되어있는 방입니다 죄송합니다.");
				System.out.println("현재 예약 현황표");
				System.out.println("1\t2\t3\t4\t5\t6\t7\t8\t9\t10");

			} 

			for (int j = 0; j < 10; j++) {
				System.out.print(h[j] + "\t");
				

			}

			System.out.println("\n");

			if (count==10) {
				System.out.println("만실입니다. 더이상 예약이 안됩니다 종료합니다.");
				break;
			}

			i++;
		}
		
		
		

		// switch문
		/*
		 * int x = 4;
		 * 
		 * switch(x) { case 1: System.out.print("1 "); break; case 2:
		 * System.out.print(" 2"); break; case 3: System.out.print("  3"); break;
		 * default: System.out.print("  1,2,3도 아님"); break; }
		 */

		/*
		 * char c = 'A';
		 * 
		 * switch (c) { case 'A': System.out.print("A "); break; case 'B':
		 * System.out.print(" B"); break; case 'C': System.out.print("  C"); break;
		 * default: System.out.print("  A,B,C도 아님"); break; }
		 */

		/*
		 * Scanner sc = new Scanner(System.in); String c = sc.next();
		 * 
		 * switch (c) { case "A": System.out.print("A "); break; case "B":
		 * System.out.print(" B"); break; case "C": System.out.print("  C"); break; case
		 * "철수야": System.out.print("  C"); break; default:
		 * System.out.print("  A,B,C도 아님"); break; }
		 */
		/*
		 * char c = '\uac00'; System.out.print(c); switch (c) { case 97:
		 * System.out.print("A "); break; case 66: System.out.print("B "); break; case
		 * 67: System.out.print("C "); break; default: System.out.print("  A,B,C도 아님");
		 * break; }
		 */

	}
}
