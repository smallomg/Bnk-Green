package vo;

public class Student2_Bus {
	
	//버스클래스를 작성하시오.
	//버스는 번스번호 승객수 받은요금총액 을 멤버변수로 가집니다.
	//버스는 만들어 질때 번호를 부여받습니다.
	//버스는 승객을 태우는 메소드(take)가 있습니다
	//버스가 승객을 태울 때 요금을 받습니다
	//버스가 승객을 태우면 승객 수는 기존 승객 수 에서 1증가합니다
	//버스 정보(버스번호, 승객수, 받는요금총액)를 콘솔에 출력하는 showinfo 함수가 있습니다
	
	private int busNum; //버스 번호
	private int people; //승객 수
	private int total; //받은 요금 총액
	Student2 s2;
	
	public Student2_Bus() {
		
	}
	public Student2_Bus(int busNum) {
		this.busNum=busNum;
	}
	
	void take(Student2 s2) {
		people++;
		total = total + 1000;
		
	}
	
	void showinfo() {
		
		System.out.println("버스 번호\t\t:\t"+busNum+"\n"+
				"승객 수\t\t:\t"+people+"\n"+
				"받은요금총액\t:\t"+total);
		System.out.print("\n");
	}
	
	
	public int getBusNum() {
		return busNum;
	}
	public void setBusNum(int busNum) {
		this.busNum = busNum;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
