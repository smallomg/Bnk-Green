package r13;

public class VIPCustomer extends Customer implements VipService{

	private static int vcnt = 1;
	private String vno;
	private double point;
	
	public VIPCustomer(Customer customer) {
		
		vno = "v" + vcnt++;
	}

	public String getVno() {
		return vno;
	}
	
	@Override
	public void savePoint(int cost) {
		point = point + (double)cost * (5/100);
	}

	@Override
	public String toString() {
		return "VIPCustomer [vno=" + vno + ", point=" + point + ", cno=" + cno + ", name=" + name + ", phone=" + phone
				+ ", payment=" + payment + "]";
	}

}
