package Interface;

public class Day2Test {

	public static void main(String[] args) {

		for (Day2 day2 : Day2.values()) {
			System.out.println(day2 + " : " + day2.getKorName() + ", " + day2.getEngName());
		}

		Day2 today = Day2.FRIDAY;
		System.out.println("오늘은 " + today.getKorName() + "입니다");
		System.out.println("Today is " + today.getEngName());
	}

}
