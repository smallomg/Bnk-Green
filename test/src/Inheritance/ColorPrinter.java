package Inheritance;

public class ColorPrinter implements Printtable{

	@Override
	public void print(Document doc) {
		System.out.println(doc.write+"칼러로 프린트합니다");
		
	}

	
}
