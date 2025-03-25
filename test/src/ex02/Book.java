package ex02;

public class Book {
	//책제목 title, 장르genre String, 출판사 publisher,가격price,저자writter
	//필수데이터 책제목 저자 출판사
	//이거에 맞게 생성자 생성
	//각 맴버변수 setter getter만드세요
	String title;
	String genre;
	String publisher;
	int price;
	String writter;
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getWritter() {
		return writter;
	}

	public void setWritter(String writter) {
		this.writter = writter;
	}
	
	//bOOKINFOTWOSTRING 책정보를 문자열로 반환하는 함수
	String bookinfotoString() {
		return this.title+this.genre+this.publisher+this.price+this.writter;
	}

	/*
	 * @Override public String toString() { return "Book [title=" + title +
	 * ", genre=" + genre + ", publisher=" + publisher + ", price=" + price +
	 * ", writter=" + writter + "]"; }
	 */
	
	
	
	
	
	
	
	
	
	
	
	
}
