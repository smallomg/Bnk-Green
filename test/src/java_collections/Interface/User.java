package Interface;


/*회원클래스를 만드시오 User
회원의 멤버변수는 회원번호 이름 성별 회원등급입니다
성별은 남자(MALE) 여자 (FEMALE)로 되어있습니다
회원등급은 골드(GOLD) 실버(SILVER) 브론즈(BRONZE)로 되어있습니다
회원등급이 골드인 회원은 할인율이 10% 적용됩니다
회원등급이 실버인 회원은 할인율이 5% 적용됩니다
회원등급이 브론즈인 회원은 할인율이 2% 적용됩니다

회원등급을 enum으로 만드시오
enum의 멤버상수는 korName(String), discountRate(double)로 한다

enum 에 calculateDiscount() 메소드를 만드시오 등급별 할인율을 적용하여
할인 금액을 반환하는 메소드
int calculateDiscount(int price)

User클래스에 pay()메소드를 만드시오
void pay(int price)
회원등급과 실제 지불한 금액을 콘솔에 출력하는 기능
예 ) 골드회원 James는 180000을 지불했습니다 -> price 200,000, discountCost = 20,000

실행클래스를 만들어 골드 실버 브론즈 회원을 테스트 하시오*/


import lombok.Data;

enum Gender {
	MALE, FEMALE;
}

enum Level {
	GOLD("골드", 0.1), SILVER("실버", 0.05), BRONZE("브론즈", 0.02);

	String korName;
	double discountRate;

	private Level(String korName, double discountRate) {
		this.korName = korName;
		this.discountRate = discountRate;
	}

	public int calculateDiscount(int price) {
		price = (int) (price - (price * discountRate));
		return price;
	}

}

@Data
public class User {

	int code;
	String name;
	Gender gender;
	Level level;

	void pay(int price) {
		System.out.println("회원번호 : " + code);
		System.out.println("회원이름 : " + name);
		System.out.println("지불금액 : " + level.calculateDiscount(price));
		System.out.println("회원성별 : " + gender);
		System.out.println("회원등급 : " + level);
	}

	public User(int code, String name, Gender gender, Level level) {
		this.code = code;
		this.name = name;
		this.gender = gender;
		this.level = level;
	}

	public static void main(String[] args) {

		User u1 = new User(1, "James", Gender.MALE, Level.GOLD);

		u1.pay(200000);

	}

}
