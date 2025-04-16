package jdbc;

import java.util.HashSet;
import java.util.Set;

public class Equals_Main {

	public static void main(String[] args) {

		Equals m1 = new Equals();

		m1.setMno(1);
		m1.setName("aaa");
		m1.setPhone("010-1111-1111");

		System.out.println(m1);

		Equals m2 = new Equals();

		m2.setMno(1);
		m2.setName("aaa");
		m2.setPhone("010-1111-1111");

		System.out.println(m2);
		System.out.println("");
		// m1과 m2를 비교하세요
		// false 주소값이 다름
		System.out.print("m1 == m2 : ");
		System.out.println(m1 == m2);
		System.out.println("");
		// 인스턴스를 비교를 할때 equals 오버라이딩해라
		System.out.print("m1.equals(m2) : ");
	
		System.out.println(m1.equals(m2));


		// m1과 m3는 완벽히 동일함
		Equals m3 = m1;
		System.out.println("");
		System.out.print("m1 == m3 : ");
		System.out.println(m1 == m3);
		
		HashSet<Equals> set = new HashSet<Equals>();
		set.add(m1);
		set.add(m2);
		System.out.println("set size : " + set.size());
	}

}
