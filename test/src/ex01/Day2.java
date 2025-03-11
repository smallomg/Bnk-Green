package ex01;

import java.util.Random;

public class Day2 {

	public static void main(String[] args) {
		/*
		 * // 2025 03 07
		 * 
		 * // 1+3+5+7+....99의 합계를 구하는 프로그램
		 * 
		 * int n = 1; int sum = 0; while (n <= 100) { sum = sum + n; n = n + 2; }
		 * System.out.println(sum);
		 * 
		 * 
		 * // 1/2+2/3+3/4...49/50합계를 구하는 프로그램
		 * 
		 * double n = 2; double sum = 0; while (n <= 50) { sum = sum + ((n - 1) / n); n
		 * = n + 1; } System.out.println(sum);
		 * 
		 * 
		 * // 1/2 + 2/3 + 3/4 ...+ 49/50합계를 구하는 프로그램
		 * 
		 * double n = 1; double sum = 0; while (n <= 49) { sum = sum + (n / (n+1)); n =
		 * n + 1; } System.out.println(sum);
		 * 
		 * 
		 * 
		 * //for문 for(int idx =0;idx<10;idx++) {
		 * 
		 * }
		 * 
		 * 
		 * // 반복문 연습 + 배열 연습 // arr변수이름으로 정수를 10개 저장할수있는 공간을 만들어라 // 그 공간에다가 1부터 10까지
		 * 0인덱스부터 9번인덱스 까지 순차적으로 집어넣어라
		 * 
		 * // 배열선언
		 * 
		 * int[] arr = new int[10]; int[] brr = new int[10];
		 * 
		 * for (int n = 0; n < 10; n++) { arr[n] = n + 1;
		 * 
		 * arr[4] = 100; System.out.print(arr[n]); } //
		 * 
		 * System.out.println(' ');
		 * 
		 * for (int n = 0; n < 10; n++) {
		 * 
		 * brr[n] = arr[9 - n]; System.out.print(brr[n]);
		 * 
		 * }
		 * 
		 * 
		 * 
		 * //a배열에 홀수 집어넣고 b배열에 짝수 집어넣기
		 * 
		 * int[] arr ={1,2,3,4,5,6,7,8,9,10}; //arr 배열선언 int[] a = new int[5]; //a배열선언
		 * int[] b = new int[5]; //b배열선언 int x = 0; //홀수를 위해 증가시켜야할 변수 x int y = 1;
		 * //짝수를 위해 증가시켜야할 변수 y
		 * 
		 * for(int i = 0; i<=4; i++) {
		 * 
		 * a[i]=arr[x]; //a[i]에 0부터 4까지 넣고 arr[x]에 2씩 증가하는 변수를 넣어서 계산하면 홀수가 나오는 배열 x =
		 * x+2; System.out.print(a[i] + " "); }
		 * 
		 * System.out.print("\n");
		 * 
		 * for(int i = 0; i<=4; i++) { b[i]=arr[y]; //arr[1] = 2이고 y를 2씩 증가시켜서 짝수가 나오게
		 * 계산하여 짝수가 나오는 배열 y = y+2; System.out.print(b[i]+ " " ); }
		 * 
		 * 
		 * int [] arr = new int [10]; int x=0,y=0;
		 * 
		 * Random rd = new Random();
		 * 
		 * 
		 * for(int i =0;i<10;i++) { int rdNum = rd.nextInt(8)+1; if(rdNum%2==0) { //짝수
		 * arr[i] = rdNum+1; x++; } else{ //홀수 arr[i] = rdNum+1; y++; }
		 * 
		 * System.out.print(arr[i] + " ");
		 * 
		 * }
		 * 
		 * System.out.print("\n"); System.out.print(x); System.out.print("\n");
		 * System.out.print(y);
		 * 
		 * 
		 * int a[] = new int[x]; int b[] = new int[y];
		 * 
		 * 
		 * for(int i = 0; i<=x;i++) { a[i] = x;
		 * 
		 * }
		 */
		 
	}
}