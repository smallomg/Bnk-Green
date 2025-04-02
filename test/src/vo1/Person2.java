package vo1;

public class Person2 {
	// 멤버변수 이름 나이
	// 떡국클래스 만들기
	// 사람이 먹는 함수 만들기 in떡국(떡국 준비)
	// 떡국 먹으면 나이 한살 증가
	// 떡국 먹으면 떡국을 먹었습니다 출력
	// 떡국 클래스의 멤버변수에 네임을 이 출력되게

	String name;
	int age;
	int calory;
	int weight=80;

	Person2() {
		weight += calory / 1000;
		
	}

	void eat(Ramen ramen, Tteokguk tteokguk) {

		ramen.eat();
		tteokguk.eat();
		age++;
		System.out.println(age + "살 입니다");
	}

	void eat(Tteokguk tteokguk) {

		tteokguk.eat();
		age++;
		System.out.println(age + "살 입니다");
	}

	void eat(Ramen ramen) {

		ramen.eat();
		
		System.out.println(age + "살 입니다");
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
