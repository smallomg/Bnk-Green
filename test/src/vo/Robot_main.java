package vo;

import java.util.Scanner;

public class Robot_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("========================================================================");
		System.out.println("\t\t\t\t"+"로봇의 기분 : " + Robot.num);

		System.out.println("========================================================================");

		for (;;) {
			System.out.println("\t"+"[0 : 꾸중]"+"\t|\t"+"[1 : 칭찬]"+"\t|\t"+"[2 : 종료]");
			int inputNum = sc.nextInt();

			Robot r = new Robot(inputNum);
			r.setName("홍길동");
			
			System.out.println("========================================================================");
			System.out.println("\t\t\t\t"+r.getName()+"의 기분 : " + Robot.num);
			System.out.println("========================================================================");
			System.out.println("\n");
			
			
			if (inputNum == 2) {
				System.out.print("종료합니다");
				break;
			}
		}
	}

}
