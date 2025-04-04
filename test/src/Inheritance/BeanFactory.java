package Inheritance;

public class BeanFactory {

	SamsungTV samsungTV = new SamsungTV();
	LgTV lgTV = new LgTV();
	TV bf;

	/*
	 * TV getBean(int n) {
	 * 
	 * if (n == 1) { bf = samsungTV; } else if (n == 2) { bf = lgTV; } return
	 * this.bf; }
	 * 
	 * TV getBean1(int n) {
	 * 
	 * if (n == 1) { return new SamsungTV(); } else if (n == 2) { return new LgTV();
	 * } else { return null; }
	 */
		
		TV getBean(String n) {

			if (n.equals("samsung")) {
				return new SamsungTV();
			} else if (n.equals("lg")) {
				return new LgTV();
			} else {
				return null;
			}

	}

}
