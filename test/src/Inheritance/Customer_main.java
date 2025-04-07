package Inheritance;

import java.util.Scanner;

public class Customer_main {

	public static void main(String[] args) {

		Regularcustomer v1 = new Vipcoutomer();
		Vipcoutomer v2 = new Vipcoutomer();

		
		Vipcoutomer v3 = new Vipcoutomer();
		Scanner sc = new Scanner(System.in);

		

		for (;;) {
			System.out.println("종료 [0] 일반고객 [1] Vip고객 [2]");
			int input = sc.nextInt();
			
			if (input == 0) {
				break;
			}
			if (input == 1) {
				System.out.println("구매금액을 입력해주세요.");
				int money = sc.nextInt();
				v1.price += money;
				System.out.println("구매금액\t:\t"+v1.price);
				if (v1.price >= 1000000) {
					v2 = (Vipcoutomer) v1;
					System.out.println("vip고객으로 전환되었습니다");
					v2.point += (v1.price *0.05);
					System.out.println("포인트\t:\t"+v2.point);
				}

			}
			if (input == 2) {
				System.out.println("구매금액을 입력해주세요.");
				int money = sc.nextInt();
				v3.price += money;
				v3.point += (v3.price / 0.05);
				System.out.println("구매금액\t:\t"+v3.price);
				System.out.println("포인트\t:\t"+v3.point);

			}
		}

	}

}
