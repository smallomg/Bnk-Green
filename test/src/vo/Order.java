package vo;


public class Order {
	String num;
	String date;
	String product;
	Member Member;
	
	public Order(String num,String date,String product,Member Member) {
		this.num=num;
		this.date=date;
		this.product=product;
		this.Member=Member;
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}

	public Member getMember() {
		return Member;
	}

	public void setMember(Member member) {
		Member = member;
	}

	@Override
	public String toString() {
		return "주문번호\t=\t" + num + "\n"
				+ "날짜\t=\t" + date + "\n"
				+ "상품 번호\t=\t" + product + "\n"
				+ "주소\t=\t" + Member.getAddress() + "\n"
				+ "아이디\t=\t" + Member.getId() + "\n"
				+ "이름\t=\t" + Member.getName() + "";
	}
	
	
	
	
}
