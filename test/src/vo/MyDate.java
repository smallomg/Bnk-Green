package vo;

public class MyDate {
//년도 월 일 ing
//월 과 일은 월은 1~12 일은 1~31 또는 30 29 2월28
//날짜 정보를 저장하는 데이터
	int year;
	int month;
	int day;
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int setDay(int day) {
		//1 31	
		if(day==1) {
			this.day = 31;
			return this.day;
		}
		//2 28
		if(day==2) {
			this.day = 28;
			return this.day;
		}
		//3 31
		if(day==3) {
			this.day = 31;
			return this.day;
		}
		//4 30
		if(day==4) {
			this.day = 30;
			return this.day;
		}
		//5 31
		if(day==5) {
			this.day = 31;
			return this.day;
		}
		//6 30
		if(day==6) {
			this.day = 30;
			return this.day;
		}
		//7 31
		if(day==7) {
			this.day = 31;
			return this.day;
		}
		//8 31
		if(day==8) {
			this.day = 31;
			return this.day;
		}
		//9 30
		if(day==9) {
			this.day = 30;
			return this.day;
		}
		//10 31
		if(day==10) {
			this.day = 31;
			return this.day;
		}
		//11 30
		if(day==11) {
			this.day = 30;
			return this.day;
		}
		//12 31
		if(day==12) {
			this.day = 31;
			return this.day;
		}
		return this.day;
		
		
		
		
	}
	public int getDay() {
		
		return day;
	}
	
	
	
	
	
	
	
	
	
}
