package Inheritance;

import java.util.Random;
import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		Random rd = new Random();
		
		Gametest g1 = new Gametest();
		Gametest g2 = new Gametest();

		Scanner sc = new Scanner(System.in);
		for (;;) {
			int num = rd.nextInt(3) + 1;
			System.out.println(num);
			
			System.out.println("종료 : [0]\t공격 : [1]\t방어 : [2]");
			int input = sc.nextInt();
		}

	}

}
