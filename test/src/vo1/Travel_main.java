package vo1;

public class Travel_main {

	public static void main(String[] args) {
		
		Travel_Busan tb = new Travel_Busan();
		Transportation b = new Bus();
		Transportation t = new Train();
		//콘솔에 버스를 타고 부산여행을 간 결과로 '부산행 버스에 몸을 싣고...'가 출력되게 하시오
		tb.goBusan(b);
		
		//콘솔에 기차를 타고 부산여행을 간 결과로 '부산행 기차에 몸을 싣고...'가 출력되게 하시오
		tb.goBusan(t);
		
		System.out.println("=================================");
		Transportation tr = new Transportation();
		tr.goBusan(b);
		tr.goBusan(t);
		tr.goBusan(tr);
		
	}

}
