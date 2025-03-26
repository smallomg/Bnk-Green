package ex02;

import vo.MyDate;

public class MyDate_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate md = new MyDate();

		for (int i = 1; i <= 12; i++) {
			md.setMonth(i);
			md.setDay(i);
			int d[] = new int[md.setDay(i)];
			System.out.println(i+"달");
			for (int j = 1; j <= md.setDay(i); j++) {
				d[i - 1] = j;
				
				System.out.print(d[i - 1]+"일 ");
			}
			System.out.print("\n");
		}

	}

}
