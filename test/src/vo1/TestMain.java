package vo1;

public class TestMain {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Worker w1 = new Worker();
		
		Person p1 = new Student();
		Person p2 = new Worker();
		Person p5 = new Person();
		
		
		Person p3[] = new Student[3];
		Person p4[] = new Worker[3];
		//형 변환 하기 위해서 부모타입에 넣어서 받는다
		Person[]p = new Person[3];
		
		p[0] = p1;
		p[1] = s1;
		p[2] = w1;
		
		Student x = (Student)p[1];
		Worker y = (Worker)p[2];
		
		
	}

}
