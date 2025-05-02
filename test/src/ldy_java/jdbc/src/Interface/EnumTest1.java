package Interface;

enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumTest1 {

	public static void main(String[] args) {

		Day today = Day.MONDAY;

		// values()를 통해 모든 상수를 배열로 리턴
		for (Day day : Day.values()) {
			System.out.println(day);
		}

		System.out.println(today);
		switch (today) {

		/*
		 * case MONDAY -> System.out.println("또 한주가 시작되었군.");
		 * 
		 * case TUESDAY -> System.out.println("언제 오나 주말.");
		 * 
		 * case WEDNESDAY -> System.out.println("오늘만 가면 2일 남았다.");
		 * 
		 * case THURSDAY -> System.out.println("이제 내일만...");
		 * 
		 * case FRIDAY -> System.out.println("이제 오늘만...");
		 */

		case SATURDAY -> System.out.println("주말이다");

		case SUNDAY -> System.out.println("내일부터 열심히 해보자이");

		default -> System.out.println("평일입니다");
		}

	}

}
