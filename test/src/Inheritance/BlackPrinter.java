package Inheritance;

public class BlackPrinter implements Printtable{

	@Override
	public void print(Document doc) {
		System.out.println(doc.write+"흑백으로 프린트 합니다");
		
	}

}
