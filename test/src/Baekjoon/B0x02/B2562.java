package Baekjoon.B0x02;

import java.util.Scanner;

public class B2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		int value = 0;
		int index = 0;

		for (int i = 0; i < 9; i++) {
			int Num = sc.nextInt();
			arr[i] = Num;

		}
		for (int i = 1; i < 9; i++) {
			if (arr[i - 1] < arr[i]) {
				value = arr[i];
				index = i;
			}
			
		}

		System.out.println(value);
		System.out.println(index+1);

	}

}
