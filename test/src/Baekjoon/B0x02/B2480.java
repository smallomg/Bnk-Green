package Baekjoon.B0x02;

import java.util.Scanner;

public class B2480 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
		int temp = 0;

		System.out.println(dice1 + " " + dice2 + " " + dice3);

		if (dice1 == dice2 && dice2 == dice1 && dice3 == dice1) {
			dice1 = 10000 + (dice1 * 1000);
		}

		else if (dice1 == dice2 || dice2 == dice3 || dice3 == dice1) {
			if(dice2==dice3) {
				temp = dice2;
				dice2 = dice3;
				dice3 = temp;
			}
			dice1 = temp;
			dice1 = 1000 + (dice1 * 100);
		}

		else if (!(dice1 == dice2 && dice2 == dice1 && dice3 == dice1)) {
			if (dice1 < dice2) {
				temp = dice1;
				dice1 = dice2;
				dice2 = temp;
				
			}
			else if (dice2 < dice3) {
				temp = dice2;
				dice2 = dice3;
				dice3 = temp;
				
			}
			
			
			dice1 = (dice1 * 100);
		}

		System.out.println(dice1);
	}

}
