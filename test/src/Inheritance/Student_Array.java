package Inheritance;

import java.util.ArrayList;

public class Student_Array {
	int num;
	String name;
	ArrayList<Student> sList;

	Student_Array(ArrayList<Student> sList, int num, String name) {
		this.num = num;
		this.name = name;
		this.sList = sList;

	}

	public void saScore() {
		boolean f = false;
		for (int i = 0; i < sList.size(); i++) {
			if (sList.get(i).getSno() == num && sList.get(i).getSname().equals(name)) {
				System.out.println("점수: " + sList.get(i).getScore());
				f = true;
				break;
			}
		}

		if (f == false) {
			System.out.println("출력 번호와 이름을 확인하세요");
		}
	}
}
