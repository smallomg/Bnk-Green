package ex01;

import java.util.Scanner;
import java.util.Random;

public class QQQ {

	public static void main(String[] args) {

		// for 10번 반복 반복문 제어 변수 i = 0 10번 반복
		// i 출력

		/*
		 * for (int i = 0; i < 10; i++) { if (i == 5) { continue; } System.out.print(i +
		 * " "); }
		 */

		// 문제 A[10] 초기화 continue를 써서 짝수의 합계를 구하라
		// 1. A배열의 길이는 10이다. ㅁ배열의 인덱스 값은 범위는 : 0 ~ 9이다.
		// 2. 반복문 제어변수는 초기값은 0으로 하고, 배열의 길이만큼 반복할거다.
		// 반복문 제어변수의 값의 범위는 0 ~ 9 까지다.

		/*
		 * int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; int sum = 0;
		 * 
		 * 
		 * for (int i = 0; i < 10; i++) { if (A[i] % 2 == 1) { continue; } sum += A[i];
		 * } System.out.println("배열 안에 있는 짝수의 합은? " + sum);
		 * 
		 * 
		 * 
		 * for (int i = 0; i < 10; i++) { if (i % 2 == 1) { continue; } sum += A[i]; }
		 * System.out.println("배열 안에 있는 짝수의 합은? " + sum);
		 */

		// switch문 이용해서
		// 0~ 100점수에 따라서 학점 구하기
		// 90 ~ 100 A학점
		// 80 ~ 89 B학점
		// 70 ~ 79 C학점
		// 60 ~ 69 D학점
		// 60미만 F학점
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int Score = sc.nextInt();
		 * 
		 * switch (Score) { case 100: System.out.print("A학점");break; case 99:
		 * System.out.print("A학점");break; case 97: System.out.print("A학점");break; case
		 * 96: System.out.print("A학점");break; case 95: System.out.print("A학점");break;
		 * case 94: System.out.print("A학점");break; case 93:
		 * System.out.print("A학점");break; case 92: System.out.print("A학점");break; case
		 * 91: System.out.print("A학점");break; case 90: System.out.print("A학점");break;
		 * 
		 * case 89: System.out.print("B학점");break; case 88:
		 * System.out.print("B학점");break; case 87: System.out.print("B학점");break; case
		 * 86: System.out.print("B학점");break; case 85: System.out.print("B학점");break;
		 * case 84: System.out.print("B학점");break; case 83:
		 * System.out.print("B학점");break; case 82: System.out.print("B학점");break; case
		 * 81: System.out.print("B학점");break; case 80: System.out.print("B학점");break;
		 * 
		 * case 79: System.out.print("C학점");break; case 78:
		 * System.out.print("C학점");break; case 77: System.out.print("C학점");break; case
		 * 76: System.out.print("C학점");break; case 75: System.out.print("C학점");break;
		 * case 74: System.out.print("C학점");break; case 73:
		 * System.out.print("C학점");break; case 72: System.out.print("C학점");break; case
		 * 71: System.out.print("C학점");break; case 70: System.out.print("C학점");break;
		 * 
		 * case 69: System.out.print("D학점");break; case 68:
		 * System.out.print("D학점");break; case 67: System.out.print("D학점");break; case
		 * 66: System.out.print("D학점");break; case 65: System.out.print("D학점");break;
		 * case 64: System.out.print("D학점");break; case 63:
		 * System.out.print("D학점");break; case 62: System.out.print("D학점");break; case
		 * 61: System.out.print("D학점");break; case 60: System.out.print("D학점");break;
		 * 
		 * case 59: System.out.print("F학점");break; case 58:
		 * System.out.print("F학점");break; case 57: System.out.print("F학점");break; case
		 * 56: System.out.print("F학점");break; case 55: System.out.print("F학점");break;
		 * case 54: System.out.print("F학점");break; case 53:
		 * System.out.print("F학점");break; case 52: System.out.print("F학점");break; case
		 * 51: System.out.print("F학점");break; case 50: System.out.print("F학점");break;
		 * 
		 * case 49: System.out.print("F학점");break; case 48:
		 * System.out.print("F학점");break; case 47: System.out.print("F학점");break; case
		 * 46: System.out.print("F학점");break; case 45: System.out.print("F학점");break;
		 * case 44: System.out.print("F학점");break; case 43:
		 * System.out.print("F학점");break; case 42: System.out.print("F학점");break; case
		 * 41: System.out.print("F학점");break; case 40: System.out.print("F학점");break;
		 * 
		 * case 39: System.out.print("F학점");break; case 38:
		 * System.out.print("F학점");break; case 37: System.out.print("F학점");break; case
		 * 36: System.out.print("F학점");break; case 35: System.out.print("F학점");break;
		 * case 34: System.out.print("F학점");break; case 33:
		 * System.out.print("F학점");break; case 32: System.out.print("F학점");break; case
		 * 31: System.out.print("F학점");break; case 30: System.out.print("F학점");break;
		 * 
		 * case 29: System.out.print("F학점");break; case 28:
		 * System.out.print("F학점");break; case 27: System.out.print("F학점");break; case
		 * 26: System.out.print("F학점");break; case 25: System.out.print("F학점");break;
		 * case 24: System.out.print("F학점");break; case 23:
		 * System.out.print("F학점");break; case 22: System.out.print("F학점");break; case
		 * 21: System.out.print("F학점");break; case 20: System.out.print("F학점");break;
		 * 
		 * case 19: System.out.print("F학점");break; case 18:
		 * System.out.print("F학점");break; case 17: System.out.print("F학점");break; case
		 * 16: System.out.print("F학점");break; case 15: System.out.print("F학점");break;
		 * case 14: System.out.print("F학점");break; case 13:
		 * System.out.print("F학점");break; case 12: System.out.print("F학점");break; case
		 * 11: System.out.print("F학점");break; case 10: System.out.print("F학점");break;
		 * 
		 * case 9: System.out.print("F학점");break; case 8: System.out.print("F학점");break;
		 * case 7: System.out.print("F학점");break; case 6: System.out.print("F학점");break;
		 * case 5: System.out.print("F학점");break; case 4: System.out.print("F학점");break;
		 * case 3: System.out.print("F학점");break; case 2: System.out.print("F학점");break;
		 * case 1: System.out.print("F학점");break; case 0: System.out.print("F학점");break;
		 * 
		 * default: System.out.print("없는 점수입니다");break;
		 * 
		 * }
		 */

		
			

			
		}

	}


