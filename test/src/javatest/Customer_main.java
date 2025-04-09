package javatest;

public class Customer_main {

	public static void main(String[] args) {
		
		Customer c =new Customer("이름1", "폰1");
		
		System.out.println(c.buy(1000010));
		
		VIPCustomer v = new VIPCustomer(c);
		System.out.println(v.getVno());
		
	}

}
