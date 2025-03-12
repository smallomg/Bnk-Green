package ex01;

import java.util.Random;
import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		/*
		 * float f = 13.625f; int n = Float.floatToIntBits(f);
		 * 
		 * System.out.println(Integer.toBinaryString(n));
		 */

		/*
		 * byte bNum = 127; // 형 변환 bNum = bNum + 1; bNum = (byte)(bNum + 1); //int ->
		 * byte 자료형으로 바꿔줌
		 * 
		 * int n = 10; n = n + 10;
		 */

		/*
		 * int n =10;
		 * 
		 * String binaryStirng = Integer.toBinaryString(n);
		 * System.out.println(binaryStirng);
		 * 
		 * int n2 = 0b0110; //2진수 접두어 0b System.out.println(n2);
		 * 
		 * int n3 = 0017; //8진수 접두어 : 0 System.out.println(n3);
		 * 
		 * int n4 = 0xA5; //16진수 접두어 : 0x System.out.println(n4);
		 */

		/*
		 * int n = -1; // 비트 거리 이동 System.out.println(n << 1); //왼쪽으로 한 칸 이동
		 * System.out.println(n << 2); System.out.println(n << 3); System.out.println(n
		 * >> 1); //오른쪽으로 한 칸 이동 System.out.println(n >> 2);
		 */

		/*
		 * // 7과 가까운 요소 int[] arr = { 21, 8, 9, 15, 42, 35, 19, 1, 5, 27
		 * }; int a=0; int x=0; for (int i = 0; i < 10; i++) { a = (arr[i] - 7); if
		 * (arr[i] - 7 < 0) { a = ((-1) * (arr[i] - 7));
		 * 
		 * } System.out.print(a + " "); a= arr[0];
		 * 
		 * 
		 * } System.out.print("\n");
		 * 
		 * System.out.print(a + " ");
		 */

		/*
		 * // 랜덤 수를 맞추는 게임 // 100점수 감점시스템 Random rd = new Random(); // 변수선언 Scanner sc =
		 * new Scanner(System.in);
		 * 
		 * int score = 100; int count = 0; // 1. 랜덤 수를 만든다. //2. 랜덤 수를 저장한다. int rdNum =
		 * rd.nextInt(10) + 1; // 0~9까지 숫자를 씀 +1로 인하여 1~10까지로 변함
		 * 
		 * // 3. 랜덤 수를 맞히기 위해 수를 입력한다. System.out.println("수를 입력해주세요.");
		 * 
		 * // 4. 입력한 수의 랜덤수를 비교한다. while (0 == 0) { // 무한루프 count++; int n =
		 * sc.nextInt();
		 * 
		 * int arr[] = new int[count];
		 * 
		 * arr[count - 1] = n;
		 * 
		 * // 4-1. 같으면 '맞혔습니다'라고 안내문을 보이고 종료한다. if (rdNum == n) { // 랜덤 수 rdNum == 내가
		 * 입력하는 값 n이 같으면 멈춤 System.out.println(count + "번째 만에 맞혔습니다.");
		 * System.out.println(score + "점수입니다.");
		 * 
		 * break;
		 * 
		 * } // 4-2. (다르면) 랜덤수보다 입력한 수가 작으면 '더 큰 수를 입력하세요'라고 안내문을 보여준다 else {score =
		 * score - 1; if (rdNum > n) { System.out.println("더 큰 수를 입력하세요.");
		 * 
		 * 
		 * } // 4-3. (다르면) 랜덤수보다 입력한 수가 크면 '더 작은 수를 입력하세요'라고 안내문을 보여준다 else
		 * System.out.println("더 작은 수를 입력하세요.");
		 * 
		 * }
		 * 
		 * }
		 */

		/*
		 * // 변수선언 int n1 = 10; int n2 = 20; int n3 = 30;
		 * 
		 * int sum = 0;
		 * 
		 * if (sum >= 60) { System.out.println("sum은 60이상입니다."); } else {
		 * System.out.println("sum은 60미만입니다."); }
		 * 
		 * if (sum % 2 == 0) { System.out.println("sum은 짝수입니다."); } else {
		 * System.out.println("sum은 6홀수입니다."); }
		 * 
		 * int[] nums = new int[5];
		 * 
		 * nums[0] = 1; nums[1] = n1; nums[2] = n2; nums[3] = n3; nums[4] = 1; //
		 * nums[5]=2; 배열의 초과한 경우
		 * 
		 * for (int i = 0; i < 5; i++) { System.out.println("num[" +i+"] : "+nums[i]); }
		 * 
		 * System.out.println("");
		 * 
		 * for (int i = 4; i >= 0; i--) { System.out.println("num[" +i+"] : "+nums[i]);
		 * }
		 */

		// 랜덤수가 숫자가 몇번 나왔는지
		// 10번 돌려서 내가 입력한 숫자 나오게 하는거랑 하이스코어 만들기

		/*
		 * Random rd = new Random(); Scanner sc = new Scanner(System.in);
		 * 
		 * int arr[] = new int[10];
		 * 
		 * int high = 0; int score = 100; int count = 0; int x = 1; int rdNum =
		 * rd.nextInt(10) + 1; System.out.println("수를 입력해주세요.");
		 * 
		 * while (true) {
		 * 
		 * count++; int n = sc.nextInt();
		 * s
		 * if (rdNum == n) { System.out.println(x + "번째."); System.out.println(count +
		 * "번째 만에 맞혔습니다."); System.out.println(score + "점수입니다."); arr[x - 1] = score;
		 * count = 0; score = 100;
		 * 
		 * x++;
		 * 
		 * System.out.println(high + "점수입니다."); break; } else { score = score - 1; if
		 * (rdNum > n) { System.out.println("더 큰 수를 입력하세요.");
		 * 
		 * } else System.out.println("더 작은 수를 입력하세요."); } } // while문
		 * 
		 * System.out.println("계속하시겠습니까?(예 : 1, 아니요 : 2)"); int ans = sc.nextInt(); if
		 * (ans == 0) { break; }
		 */
		/*
		 * int[] A = { 1, 11, 3, 4, 5, 6, 7, 8, 9, 10 }; // 배열안의 짝수가 몇개인지 홀수가 몇개인지 int
		 * count1 =0; int count2 =0; for (int i = 0; i < 10; i++) { if (A[i] % 2 == 0) {
		 * count1++; } if (A[i] % 2 == 1) { count2++; } }
		 * System.out.println("짝수는 : "+count1); System.out.println("홀수는 : "+count2);
		 * 
		 * // 배열안의 최대값 구하기 int max = A[0]; for (int i = 1; i < 10; i++) { if(A[i]>max) {
		 * max = A[i]; } } System.out.println("최대값은 : "+max); // 배열안의 최소값 구하기 int min =
		 * A[0]; for (int i = 1; i < 10; i++) { if(A[i]<min) { min = A[i]; } }
		 * System.out.println("최소값은 : "+min); // 배열안에 3의 배수가 몇개인가? int count3 = 0; for
		 * (int i = 0; i < 10; i++) { if(A[i]%3==0) { count3++; } }
		 * System.out.println("3의배수의 갯수는 : "+count3); // 배열안의 총합구하기 int sum = 0; for
		 * (int i = 0; i < 10; i++) { sum += A[i]; }
		 * System.out.println("배열안의 총합은 : "+sum); // 배열안의 평균구하기 int sum1 = 0; for (int i
		 * = 0; i < 10; i++) { sum1 += A[i]; }
		 * System.out.println("배열안의 평균은 : "+sum1/10);
		 */
	}

}