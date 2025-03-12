package Baekjoon.B0x02;

import java.util.Scanner;

public class B2752 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] A = new int[3];

        // 입력값을 배열에 저장
        for (int i = 0; i < 3; i++) {
            A[i] = sc.nextInt();
        }

        // 버블 정렬 알고리즘으로 배열을 정렬
        for (int i = 0; i < 3 - 1; i++) {
            for (int j = 0; j < 3 - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }

        // 정렬된 값 출력
        for (int i = 0; i < 3; i++) {
            System.out.print(A[i] + " ");
        }

        sc.close();
    }
}
