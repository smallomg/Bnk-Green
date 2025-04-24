package ex06;

import java.sql.Date;

import lombok.Data;

@Data

public class Member {

	int custno;
	static int seq = 1;
	String custname;
	String phone;
	String address;
	String joindate;
	String grade;
	String city;
	public Member() {
		custno=seq;
		seq++;
	}
}
