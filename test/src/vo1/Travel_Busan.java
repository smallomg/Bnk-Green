package vo1;

public class Travel_Busan extends Transportation{
	//버스타고 가는 메서드
	public void goBusan(Bus Bus) {
		Bus.go();
	}
	//기차타고 가는 메서드
	public void goBusan(Train Train) {
		Train.go();
	}
}
