package vo1;

public class Person2_main {

	public static void main(String[] args) {
		
		Person2 ps = new Person2();
		Tteokguk t = new Tteokguk();	
		Ramen r = new Ramen();
		Person2 ps1 = new Person2();
		ps.setName("반갑동");
		ps.setAge(25);
		
		t.setName("떡떡국국");
		r.setName("라라면면");
		
		ps.eat(r,t);
		
		
		ps1.setName("반갑동");
		ps1.setAge(20);
		ps1.eat(t);
		ps1.eat(r);
	}

}
