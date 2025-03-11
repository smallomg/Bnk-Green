package ex01;

import java.util.Scanner;
import java.util.Random;

public class RSP_Game {

	public static void main(String[] args) {

		// 가위 바위 보 몇판했는지 몇번 이기고 졌는지 1 가위 2 바위 3보 게임은 그만 하고 싶을때 까지 게임을 그만둘때 게임이 끝날때마다 게임 전적이 나오게
		// 컴퓨터가 제일 많이 낸거 
		// 내가 뭘 냈을때 많이 이겼는가?


		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int count = 0; // 몇번째 게임인지 확인하기 위해

		int c1 = 0; // 컴퓨터 승리 횟수
		int c2 = 0;
		int c3 = 0;
		int u1 = 0; // 유저 승리 횟수
		int u2 = 0;
		int u3 = 0;
		int p = 0; // 무승부 횟수
		// 반복문

		while (true) {

			int com = rd.nextInt(3) + 1;
			System.out.println(count + 1 + "번째 게임 ");
			System.out.println("가위 : 1 바위 : 2 보 :3");

			System.out.println("계속할래?(Y:1/N:0)");
			int ans = sc.nextInt();

			if (ans == 1) {
				System.out.println("나도 내야지 >>");
				int user = sc.nextInt();

				System.out.println("com : " + com);
				System.out.println("user : " + user);

				if (com == user) {
					System.out.println("무승부.");
					p++;
				} 
				else if (com == 1 && user == 3 || com == 2 && user == 1 || com == 3 && user == 2) {
					System.out.println("컴퓨터 승리.");
					c1++;
				}
				else if (com == 2 && user == 1 || com == 3 && user == 2) {
					System.out.println("컴퓨터 승리.");
					c2++;
				}
				else if (com == 3 && user == 2) {
					System.out.println("컴퓨터 승리.");
					c3++;
				}
				
				
				
				else if (com == 3 && user == 1) {
					System.out.println("유저 승리.");
					u1++;
				} 
				else if (com == 1 && user == 2 ) {
					System.out.println("유저 승리.");
					u2++;
				} 
				else if ( com == 2 && user == 3) {
					System.out.println("유저 승리.");
					u3++;
				} 
				else {
					System.out.println("1(가위) 2(바위) 3(보)입니다 제대로 입력하세요.");

				}
				System.out.println("컴퓨터 승리 횟수 :" +(c1+c2+c3));
				System.out.println("유저 승리 횟수 :" + (u1+u2+u3));
				System.out.println("무승부 횟수 :" + p);
				System.out.println("이때까지 컴퓨터는 1 가위을 냈을때 이긴 횟수 :" + c1);
				System.out.println("이때까지 컴퓨터는 2 바위을 냈을때 이긴 횟수 :" + c2);
				System.out.println("이때까지 컴퓨터는 3 보을 냈을때 이긴 횟수 :" + c3);
				System.out.println("이때까지 내가 1 가위을 냈을때 이긴 횟수 :" + u1);
				System.out.println("이때까지 내가 2 바위을 냈을때 이긴 횟수 :" + u2);
				System.out.println("이때까지 내가 3 보을 냈을때 이긴 횟수 :" + u3);
				System.out.println("총게임 횟수 :" + (count));
			}

			else if (ans == 0) {
				System.out.println("게임을 끝냅니다.");
				System.out.println("컴퓨터 승리 횟수 :" + (c1+c2+c3));
				System.out.println("유저 승리 횟수 :" +  (u1+u2+u3));
				System.out.println("무승부 횟수 :" + p);
				System.out.println("이때까지 컴퓨터는 1 가위을 냈을때 이긴 횟수 :" + c1);
				System.out.println("이때까지 컴퓨터는 2 바위을 냈을때 이긴 횟수 :" + c2);
				System.out.println("이때까지 컴퓨터는 3 보을 냈을때 이긴 횟수 :" + c3);
				System.out.println("이때까지 내가 1 가위을 냈을때 이긴 횟수 :" + u1);
				System.out.println("이때까지 내가 2 바위을 냈을때 이긴 횟수 :" + u2);
				System.out.println("이때까지 내가 3 보을 냈을때 이긴 횟수 :" + u3);
				System.out.println("총게임 횟수 :" + (count));
				break;
			}

			else {
				System.out.println("입력값이 1(예) 또는 0(아니요) 아닙니다 제대로 입력하세요.");

			}
			
			System.out.print("\n");
			count++;

		}

	}

}
