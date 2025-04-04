package Inheritance;

import java.util.Scanner;

public class TVUser_main {

	public static void main(String[] args) {

		/*
		 * SamsungTV samsungTV = new SamsungTV(); samsungTV.powerOn();
		 * samsungTV.powerOff(); samsungTV.volumeUp(); samsungTV.volumeDown();
		 * 
		 * LgTV lgTV = new LgTV(); lgTV.turnOn(); lgTV.turnOff(); lgTV.soundUp();
		 * lgTV.soundDown();
		 */
		
		/*
		 * TV tv1 =new SamsungTV(); tv1.powerOn(); tv1.powerOff(); tv1.volumeUp();
		 * tv1.volumeDown();
		 * 
		 * TV tv2 =new SamsungTV(); tv2.powerOn(); tv2.powerOff(); tv2.volumeUp();
		 * tv2.volumeDown();
		 * 
		 * TV tvs[] = new TV[2]; tvs[0]=tv1; tvs[1]=tv2;
		 * 
		 * for(int i = 0;i<tvs.length;i++) { tvs[i].powerOn(); tvs[i].powerOff();
		 * tvs[i].volumeUp(); tvs[i].volumeDown(); }
		 */
		
		/*
		 * BeanFactory factory = new BeanFactory(); TV tv3 = factory.getBean(1);//1이면
		 * 삼성tv, 2이면 LGtv가 작동되게
		 * 
		 * tv3.powerOn(); tv3.powerOff(); tv3.volumeUp(); tv3.volumeDown();
		 */
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		BeanFactory factory = new BeanFactory();
		
		TV tv3 = factory.getBean(s); //samsung 넣으면 삼성티비나오게 
		
		tv3.powerOn(); 
		tv3.powerOff(); 
		tv3.volumeUp(); 
		tv3.volumeDown();
		
		
	}
}
