package ex06;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Join {
	int custno;
	String custname;
	String grade;
	int price;
}
