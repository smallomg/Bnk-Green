package ex02;

public class Construct {

	public static void main(String[] args) {

		/*
		 * Student st = new Student(1, "반갑고", 'm'); Student st2 = new Student(2, "방가롱");
		 * Student st3 = new Student();
		 * 
		 * System.out.println(st.no); System.out.println(st2.name);
		 * 
		 * st.NC(); System.out.println(st.no); st.setNo(50); System.out.println(st.no);
		 * 
		 * st.reNo(); st.reSt(); st.reGd(); System.out.println(st.no);
		 * System.out.println(st.name); System.out.println(st.gender);
		 */

		Book b = new Book();
		b.title="a";
		b.genre="b";
		b.publisher="c";
		b.price=1;
		b.writter="d";
		System.out.println(b.title);
		System.out.println(b.writter);
		System.out.println(b.publisher);
		
		b.getTitle();
		b.getWritter();
		b.getPublisher();
		System.out.println(b.title);
		System.out.println(b.writter);
		System.out.println(b.publisher);
		System.out.print("\n");
		System.out.println(b.bookinfotoString()); 
	}
}
