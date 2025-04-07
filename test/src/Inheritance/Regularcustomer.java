package Inheritance;

public class Regularcustomer {
	int cnum = 0;
	String name;
	String phone;
	int price;

	Regularcustomer() {
		cnum++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
