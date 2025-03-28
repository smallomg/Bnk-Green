package vo;

public class Student3 {

	// 선생님이 성적처리 하는 프로그램
	// 5명의 학생정보를 입력
	// 이름 학년 번호 국 영 수
	// 학생 인스턴스에서는 학생정보를 다 들어가
	// 학생들의 성적표가 만들어짐
	// 총점 구해지고 세과목이 평균이 60점 미만이면 유급 60이상이면 통과
	// 성적처리가 신호가 가면 학생
	// 클래스의 학생의 총점과 평균점수와 낙제 여부가 학생인스턴스에 기록된다
	// 학생들의 순위 1등2등3등4등5등 순위 정보도 학색 인스턴스에 기록됨
	// 메뉴 성적처리 학생성적조회 학생순위조회 1번학생의성적조회(개별조회)

	String name; // 이름
	int grade; // 학년
	int school_num; // 번호
	int kor; // 국어
	int eng; // 영어
	int math; // 수학
	
	int sum; //총점
	int avg; //평균
	
	public void Indi(int school_num) {
		if(this.school_num==school_num) {
			System.out.print("이름"+"\t" + name + "\n"+
							"학년"+"\t"  + grade + "\n"+
							"번호" +"\t" + school_num + "\n"+
							"국어점수" +"\t" + kor + "\n"+
							"영어점수" +"\t" + eng + "\n"+
							"수학점수" +"\t" + math + "\n"+
							"총점" +"\t" + sum + "\n"+
							"평균" +"\t" + avg+ "\n");
		}
	}
	
	
	public int Total() {
		sum = kor+eng+math;
		return sum;
	}
	public int Average() {
		Total();
		avg = sum/3;
	
		return avg;
	}
	
	
	public void Test() {
		if(avg>=60) {
			System.out.println("통과");
		}
		else {
			System.out.println("유급");
		}
	}
	
	
	public Student3(String name, int grade, int school_num, int kor, int eng, int math) {
		this.name = name;
		this.grade = grade;
		this.school_num = school_num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getSchool_num() {
		return school_num;
	}

	public void setSchool_num(int school_num) {
		this.school_num = school_num;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "이름"+"\t" + name + "\n"+
				"학년"+"\t"  + grade + "\n"+
				"번호" +"\t" + school_num + "\n"+
				"국어점수" +"\t" + kor + "\n"+
				"영어점수" +"\t" + eng + "\n"+
				"수학점수" +"\t" + math + "\n"+
				"총점" +"\t" + sum + "\n"+
				"평균" +"\t" + avg+ "\n";
	}

	

}
