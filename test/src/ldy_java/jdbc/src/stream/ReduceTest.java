package stream;

import java.util.Arrays;
import java.util.List;

public class ReduceTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "전우치", "손오공", "해리포터");

		// 초기 기준 값 이순신 
		// 기준 값 문자열의 길이가 같으면 이순신 출력 예시( 홍길동 전우치 손오공)
		// 기준 값의 문자열의 길이가 list안에 있는 문자열의 길이보다 작으면 list 안에 있는 문자열 출력
		// 해리포터 출력 예시 (홍길동 전우치 손오공 해리포터)
		String name = list.stream()
				.reduce("이순신", (s1, s2) -> 
				s1.length() >= s2.length() ? s1 : s2);

		System.out.println(name);

	}

}
