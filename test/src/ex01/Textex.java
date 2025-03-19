package ex01;

import java.util.Random;

public class Textex {
	public static int rd() {
		Random rd = new Random();
		int com = rd.nextInt(3) + 1;
		return com;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rd();
		System.out.print(rd());
	}

}
