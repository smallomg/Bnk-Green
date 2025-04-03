package Inheritance;

public class SamsungTV implements TV{
	public void powerOn() {
		System.out.println("SamsungTV 전원 켠다");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV 전원 끈다");
	}
	
	public void volumeUp() {
		System.out.println("SamsungTV 소리 키우기");
	}
	
	public void volumeDown() {
		System.out.println("SamsungTV 소리 줄이기");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		
	}
}
