package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream1 {
	/*
	 * Stream 자료의흐름 데이터뭉치(콜렉션 자료)
	 * 
	 * -중간연산 filter : 조건에 맞는 자료들 추출하기 map : 자료들 특정한 형태로 변환하기(예:문자열 -> 문자열의 길이)
	 * ===============================================무조건 알아야함 sorted() : 정렬
	 * distict() : 중복제거 limit() : 스트림 범위 제한 skip() : 스트림 내 데이터들 중 앞에서 n개 요소 건너뜀
	 * 
	 * --최종연산 collect() : 콜렉션 자료 만들어 반환 forEach() : 각 요소에 대한 작업 수행 count() : 요소 개수
	 * 반환 reduce() : 요소들을 하나의 결과로 만들기 anyMatch(), allMatch() : 조건 검사
	 * 
	 * --삼항 연산자 (if -else) 조건 ? 참:거짓
	 */
	public static void main(String[] args) {

		// Stream 연산은 기존자료를 변경하지 않는다.
		// Stream 연산은 중간연산과 최종연산으로 구성
		// Stream 한번 생성된 연산은 재사용 불가
		int[] arr = { 1, 2, 3, 4, 5 };

		// 1. 스트림 생성
		IntStream stm1 = Arrays.stream(arr);

		// 2. 중간 연산
		IntStream stm2 = stm1.filter(n -> n % 2 == 1); //rambda

		// 3. 최종 연산
		int sum = stm2.sum();
		System.out.println("홀수의 합 : " + sum);

		
		int sum2 = Arrays.stream(arr)
				.filter(n -> n % 2 == 0)
				.sum();
		System.out.println("짝수의 합 : " + sum2);
	}

}
