package ex01;

import java.util.Scanner;

public class Vendingmachine {

	public static void main(String[] args) {

		/*
		 * 관리자 모드	 		고객 모드 
		 * 상품을 채움 			돈을 넣는다 
		 * 돈을 채워 넣는다		 상품을 선택한다 
		 * 하루수익 본다 		잔돈을 가져간다 
		 * 오류가없는지확인		 상품을가져간다
		 */

		Scanner sc = new Scanner(System.in);

		/* 거스름 돈 */
		int change = 0;
		/* 상품의 갯수 */
		int product[] = { 5, 5, 5 };
		int price[] = { 1000, 2000, 3000 };

		int count = 0;
		int Num = 0;

		/* 수익 */
		int revenue = 0;

		for (;;) {
			/* 1.관리자 모드 고객 모드 들어가기 */
			System.out.println("0=관리자모드 1=고객모드 2=종료");
			System.out.print("입력하세요>>");
			int mode = sc.nextInt();

			if (mode == 2) {
				System.out.println("종료합니다");
				break;
			}

			/* 0일때 관리자 모드 */
			if (mode == 0) {
				System.out.println("1 상품 갯수 확인 및 채움");
				System.out.println("2 수익 확인");
				System.out.println("3 가격 수정");
				System.out.println("4 종료");
				System.out.println("입력하세요");
				int manager = sc.nextInt();

				if (manager == 1) {
					System.out.println("코카콜라\t펩시\t맥콜\t");
					for (int i = 0; i < 3; i++) {
						System.out.print(product[i] + "\t");
					}
					System.out.print("\n");
					for (int i = 0; i < 3; i++) {
						product[i] = 5;
					}
					System.out.println("========================");
					for (int i = 0; i < 3; i++) {
						System.out.print(product[i] + "\t");
					}
					System.out.print("\n");
					System.out.println("채웠습니다");
					System.out.print("\n");

				}
				if (manager == 2) {
					System.out.println(" 거래 횟수 :" + "\t" + Num);
					System.out.println("   수익   : " + "\t" + revenue);
				}
				if (manager == 3) {
					System.out.println("수정시킬 제품을 정하세요");
					System.out.println("1.코카콜라" + "\t" + price[0]);
					System.out.println("2.펩시" + "\t" + price[1]);
					System.out.println("3.맥콜" + "\t" + price[2]);
					int cor = sc.nextInt();

					System.out.println("가격을 수정하세요");
					int m = sc.nextInt();
					if (cor == 1) {

						price[0] = m;
					}
					if (cor == 2) {

						price[1] = m;
					}
					if (cor == 2) {

						price[1] = m;
					}
					System.out.println("코카콜라\t펩시\t맥콜\t");
					for (int i = 0; i < 3; i++) {
						System.out.print(price[i] + "\t");
					}
					System.out.print("\n");

				}
				if (manager == 4) {
					System.out.println("종료합니다");
					break;
				}

			}

			/* 1일때 고객 모드 */
			if (mode == 1) {
				System.out.print("돈을 넣어주세요>>");
				/* 고객이 넣는 돈 */
				count = 0;
				int putmoney = sc.nextInt();

				for (;;) {
					System.out.println("1=코카콜라 2=펩시 3=맥콜");
					System.out.print("상품을 선택해주세요>>");
					int productNum = sc.nextInt();

					/* 거스름돈 계산 */
					if (product[productNum - 1] >= 1 && change >= price[productNum - 1]) {
						change = change - price[productNum - 1];
						revenue += price[productNum - 1];
						product[productNum - 1]--;
						count++;
					}
					if (count == 0) {
						change = putmoney - price[productNum - 1];
						revenue += price[productNum - 1];
						product[productNum - 1]--;
					}

					if (product[productNum - 1] == 0) {
						System.out.println("상품을 소진되었습니다 다른 상품을 골라주세요");
						System.out.println(change + "거스름돈");
					}

					if (price[0] > change) {
						System.out.println("잔돈을 드릴게요");
						System.out.println(change);
						break;
					}

					System.out.println("종료하시겠습니까? 계속 1  종료 2");
					int End = sc.nextInt();

					if (End == 2) {
						System.out.println("잔돈을 드릴게요");
						System.out.println(change);
						break;
					}

					System.out.println("거스름 돈은 " + change);
					System.out.print("\n");

				}
				Num = count + 1;
			}

		}

	}

}
