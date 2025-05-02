package stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMidOpsTest {

	public static void main(String[] args) {
		List<Integer> number = List.of(10, 20, 30, 40, 50, 60, 70);

		List<Integer> results = number.stream()
				.skip(2) // 2개의 요소를 건너뜀
				.limit(3) // 요소를 3개로 제한
				// .forEach(System.out::println);
				.collect(Collectors.toList());

		System.out.println(results);

		Integer results2 = results.stream()
			   .reduce(0, (a, b) -> a + b); 
		// 0을 기준값으로 a = 0 대입 b = 30 대입 a + b = 30을 다시 a에 대입 반복
		//a = 0 	b = 30 	a+b = 30 
		//a = 30 	b = 40 	a+b = 70
		//a = 70 	b = 50 	a+b =120
		
			   
		System.out.println(results2);

	}

}
