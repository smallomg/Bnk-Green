package Inheritance;

import java.util.Scanner;

public class Printer_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Printtable pt1 = new BlackPrinter();
		Printtable pt2 = new ColorPrinter();

		Printtable pt[] = new Printtable[2];

		pt[0] = pt1;
		pt[1] = pt2;

		Document doc = new Document();
		
		doc.write();
		
		PrinterSelector ps = new PrinterSelector();
		ps.select(doc);
	}
}
