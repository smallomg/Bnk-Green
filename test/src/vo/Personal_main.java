package vo;

public class Personal_main {

	public static void main(String[] args) {
	
		Student s = new Student();
		Personal p = new Personal("이대영",20010205,"부산","010-1234-4567",s);
		
		s.setSchool("학교명");
		s.setGrade(3);
		s.setCl(1);
		s.setSn(42);
		
		System.out.println("학생이 되기전");
		System.out.println(p);
		
		System.out.println("\t학생이 되기후");
		System.out.println(p.toString1());
	}

}
