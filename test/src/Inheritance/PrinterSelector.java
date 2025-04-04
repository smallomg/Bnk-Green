package Inheritance;


import java.util.Scanner;

public class PrinterSelector {
	Scanner sc = new Scanner(System.in);
	Printtable printer;
	
	public void select(Document doc) {
		System.out.println("프린터를 선택하세요(흑백 : black, 칼라 : color)");
		String input = sc.nextLine();
		if(input.equals("black")) {
			printer = new BlackPrinter();
			printer.print(doc);
		}
		if(input.equals("color")) {
			printer = new ColorPrinter();
			printer.print(doc);
		}
	}
}
