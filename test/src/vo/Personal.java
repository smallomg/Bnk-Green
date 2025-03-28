package vo;

public class Personal {

	String name; //이름
	int birth; //생년월일
	String address; //집주소
	String phone; //전화번호
	Student Student;
	
	public Personal(String name,int birth, String address,String phone,Student Student) {
		this.name=name;
		this.birth=birth;
		this.address=address;
		this.phone=phone;
		this.Student=Student;
	}
	
	public Student getStudent() {
		return Student;
	}
	public void setStudent(Student student) {
		Student = student;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "이름 \t: \t" + name + "\n"+
				"주민번호 \t: \t" + birth+ "\n"+
				"주소 \t: \t" + address + "\n"+
				"전화번호 \t: \t" + phone + "\n";
	}
	
	
	public String toString1() {
		return "\t이름 \t: \t" + name + "\n"+
				"\t주민번호 \t: \t" + birth+ "\n"+
				"\t주소 \t: \t" + address + "\n"+
				"\t전화번호 \t: \t" + phone + "\n"+
				"\t학교명 \t: \t" + Student.getSchool()+ "\n"+
				"\t학년 \t: \t" + Student.getGrade()+ "\n"+
				"\t반 \t: \t" + Student.getCl()+ "\n"+
				"\t학번 \t: \t" + Student.getSn()+ "\n";
	}
	
	
	
}
