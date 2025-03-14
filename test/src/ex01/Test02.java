package ex01;

import java.util.Scanner;
import java.util.Random;

public class Test02 {

	public static void main(String[] args) {

		/*
		 * int arr[][] = new int[3][5];
		 * 
		 * int X = 1; for (int i = 0; i < 3; i++) {
		 * 
		 * for (int j = 0; j < 5; j++) { arr[i][j]=X; X++;
		 * 
		 * System.out.print(arr[i][j] + "\t"); } System.out.print("\n"); }
		 * 
		 * System.out.println(arr[0]); System.out.println(arr[1]);
		 * System.out.println(arr[2]); System.out.println(arr[3]);
		 */

		// 5행 5열 board 정수 배열
		// 프로그램 시작시 자동으로 1이라는 숫자가 5군데 공간에 1을 넣는다 랜덤
		// 5행 5열 1찾기 게임 행번호 입력하세요 열 번호를 입력하세요 있으면 있다 없으면 없다
		// 5개 다 찾으면 게임 끝
		// 마지막 몇번째 맞췄습니다 현황표만들기

		/*
		 * Random rd = new Random(); Scanner sc = new Scanner(System.in);
		 * 
		 * int board[][] = new int[5][5]; int c = 0; int gameCounting = 0; int V = 0;
		 * 
		 * for (int i = 0; i < 5; i++) { for (int j = 0; j < 5; j++) { int rdNum =
		 * rd.nextInt(2); board[i][j] = rdNum;
		 * 
		 * if (board[i][j] == 1) { c++; } if (c == 5) { break; } } if (c == 5) { break;
		 * } } System.out.println(c); for (int i = 0; i < 5; i++) { for (int j = 0; j <
		 * 5; j++) { System.out.print(board[i][j] + " ");
		 * 
		 * } System.out.print("\n");
		 * 
		 * }
		 * 
		 * for (;;) { int i = 0; int j = 0;
		 * 
		 * System.out.println(gameCounting + 1 + "번째 게임입니다.");
		 * System.out.print("행번호를 입력하세요 >>"); int row = sc.nextInt(); // 행
		 * System.out.print("열번호를 입력하세요 >>"); int col = sc.nextInt(); // 열
		 * 
		 * if (board[row][col] == 2) { System.out.println("맞추셨던 번호입니다 다른 번호를 입력하세요.");
		 * 
		 * }
		 * 
		 * if (board[row][col] == 1) {
		 * 
		 * board[row][col] = 2; V++; System.out.println(V + "번째 맞추셨습니다."); }
		 * 
		 * if (board[row][col] == 0) { System.out.println("틀리셨습니다."); }
		 * 
		 * if (V == 5) { break; }
		 * 
		 * System.out.print("\n");
		 * 
		 * gameCounting++; i++; j++; }
		 * 
		 * for (int i = 0; i < 5; i++) { for (int j = 0; j < 5; j++) {
		 * 
		 * if (board[i][j] == 2) { System.out.print("찾음" + "\t");
		 * 
		 * } else { System.out.print(board[i][j] + "\t");
		 * 
		 * }
		 * 
		 * } System.out.print("\n");
		 * 
		 * }
		 */

		/*
		 * //int A[][] ={{1,2,3,4,5}, {10,9,8,7,6}, {11,12,13,14,15},
		 * {20,19,18,17,16},{21,22,23,24,25}}; 만들기
		 */

		/*
		 * int A[][] = new int[5][5]; int Num = 1; int temp = 0;
		 * 
		 * for (int i = 0; i < 5; i++) { for (int j = 0; j < 5; j++) { A[i][j] = Num;
		 * Num++; }
		 * 
		 * } for (int i = 0; i < 5; i++) { for (int j = 0; j < 5; j++) { if (i % 2 == 1
		 * && j == 0) { temp = A[i][0]; A[i][0] = A[i][4]; A[i][4] = temp; } if (i % 2
		 * == 1 && j == 1) { temp = A[i][1];
		 * 
		 * A[i][1] = A[i][3];
		 * 
		 * A[i][3] = temp; }
		 * 
		 * System.out.print(""); } }
		 * 
		 * for (int i = 0; i < 5; i++) { for (int j = 0; j < 5; j++) {
		 * System.out.print(A[i][j] + "\t"); } System.out.print("\n"); }
		 */

		// 4X4 학생 성적을 입력하세요
		// 국 	영 	수 	총점
		// 100 90 	80 국어총점
		// 90 	80	 70
		// 80 85 80
		//  영총점 수 총점

		Scanner sc = new Scanner(System.in);
		int count = 1;

		int A[][] = new int[4][4];
		int B[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int Num = sc.nextInt();
				B[i][j] = Num;

			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				A[i][j] = B[i][j];

			}
		}
		
		System.out.println("===========================================");
		System.out.print("\t국어\t영수\t수학\t총점");
		System.out.print("\n");

		for (int i = 0; i < 4; i++) {
			System.out.print(count + "번째\t");
			for (int j = 0; j < 4; j++) {

				if (j == 3) {
					A[i][3] = A[i][0] + A[i][1] + A[i][2];
				}
				if (i == 3) {
					A[3][j] = A[i - 1][j] + A[i - 2][j] + A[i - 3][j];
				}

				System.out.print(A[i][j] + "\t");
			}

			System.out.print("\n");
			count++;
		}

	}
}
