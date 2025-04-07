package Inheritance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Box_Zeneric_main {

	public static void main(String[] args) {

		Box<String> box = new Box<String>();

		box.t = "String";
		System.out.println(box.t);

		Box<X> xbox = new Box<>(); // X는 클래스 
		//xbox는 참조변수이고 참조변수에 객체를 줘야 값이 넣어진다
		xbox.t = new X(); 
		xbox.t.x = 10;
		System.out.println(xbox.t.x);
		
		ArrayList<String> sList1 = new ArrayList<>();
		ArrayList<Integer> sList2 = new ArrayList<>();
		sList1.add("헤이");
		sList2.add(123);
		System.out.println(sList1);
		System.out.println(sList2);
	
		
		Box2 box2 = new Box2();
		Box2 box3 = new Box2();
		box2.t = Integer.valueOf(10);
		box3.t = new X();
		System.out.println(box2.t);
		System.out.println(box3.t);
	}

}
