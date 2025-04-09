package javatest;

public class CustomerManager {

	public static VIPCustomer createVipCustomer(Customer customer) {
		VIPCustomer vc = new VIPCustomer(customer);
		return vc;
	}


}
