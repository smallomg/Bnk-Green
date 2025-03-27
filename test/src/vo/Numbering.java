package vo;

public class Numbering {
//인간이 하나도 만들어지지 않은 상태의 인간 수는 0이다
	// Numbering 클래스를 하나 만들자 멤버변수에는 고유번호가 있어야 한다.

//인간이 태어날 때 마다 인구 수는 1씩 증가한다
//인간은 태어날때 자신만의 고유 번호를 갖게 된다.
//이 번호는 자동으로 부여된다

	// 생성자를 통해 하나씩 증가
	// 증가한 변수를 스태틱변수에 넣어줘라
	// 증가한 변수를 저장해야해
	// 어떻게?
	public static int cnt; // 클래스 변수로 인간의 총 수를 구하는데 사용 예정
	public int id; // 고유 번호
	char gender; //남자 m 여자 f
	
	public Numbering() {
		++cnt;
		id = cnt;
		
	}
	public Numbering(char gender) {
		++cnt;
		id = cnt;
		this.gender=gender;
	}
	
	public void setGender(char gender) {
		this.gender=gender;
	}

	public char getGender() {
		return gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
