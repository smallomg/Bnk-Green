package vo;

import java.util.Scanner;

public class Unit_main {

	public static void main(String[] args) {

		Unit u1 = new Unit();
		Unit u2 = new Unit();


		u1.setName("user1");
		
		u2.setName("user2");

		
		u2.attack(u1);
		u2.attack(u1);
		u2.attack(u1);
		
		System.out.println(u1.getEnergy());
		
		
	
		
		
		
	}

}
