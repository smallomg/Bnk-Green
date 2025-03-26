package vo;

public class Human {
	private String name; // 이름
	private int age; // 나이

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		if (1 <= age && age <= 200) {
			this.age = age;
		} else {
			System.out.println("값의 허용범위를 벗어났어요.");
			this.age = 0;
		}
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		if (this.age != 0) {
			return "[이름 : " + name + "\t]\t[나이 : " + age + "\t]";

		} else {
			return "[이름 : " + name + "\t]\t[나이 : 미정\t]";
		}
	}

	public Human() {

	}

	public Human(String name, int age) {
		this.name=name;
		int result = checkAge(age);
		this.age=result;
	}
	
	private int checkAge(int age) {
		if (1 <= age && age <= 200) {
			return age;
		} else {
			System.out.println("값의 허용범위를 벗어났어요.");
			return 0;
		}
	}

}
