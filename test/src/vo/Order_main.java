package vo;

public class Order_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Member m = new Member();
		Order c = new Order("202503280001","2025년 3월 28일","PD0345-12",m);
		
		m.setId("abc123");
		m.setName("홍길동");
		m.setAddress("서울시");
		
		System.out.println(c);
	}

}
