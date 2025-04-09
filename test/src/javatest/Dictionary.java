package javatest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
	public static void main(String[] args) {
		// 한영 사전 한글을 내면 영어가 나옴
		// 단어 등록
		// 단어 조회

		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();

		for (;;) {
			System.out.println("종료 [0] 단어등록 [1] 단어조회 [2]");
			int input = sc.nextInt();
			if (input == 0) {
				break;
			}
			if (input == 1) {
				System.out.println("단어등록");
				System.out.println("한글단어와 영어단어를 입력해주세요");
				String kor = sc.nextLine();
				String eng = sc.nextLine();

				map.put(kor, eng);
				map.get(kor);
				String result = map.get(kor);
				System.out.println(result);
			}

			if (input == 2) {

				for (int i = 0; i < map.size(); i++) {
					System.out.println(map);
				}
			}

		}

	}
}
