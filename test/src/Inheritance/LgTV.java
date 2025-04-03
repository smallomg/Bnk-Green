package Inheritance;

public class LgTV implements TV {

	public void turnOn() {
		System.out.println("LgTV 전원 켠다");
	}

	public void turnOff() {
		System.out.println("LgTV 전원 끈다");
	}

	public void soundUp() {
		System.out.println("LgTV 소리 키우기");
	}

	public void soundDown() {
		System.out.println("LgTV 소리 줄이기");
	}

	@Override
	public void powerOn() {
		turnOn();
		

	}

	@Override
	public void powerOff() {
		turnOff();

	}

	@Override
	public void volumeUp() {
		soundUp();

	}

	@Override
	public void volumeDown() {
		soundDown();

	}
}
