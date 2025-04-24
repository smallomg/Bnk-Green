package ex06;

import lombok.Data;

@Data
public class Money extends Member{
	int custno;
	int salenol;
	int pcost;
	int amount;
	int price;
	String pcode;
	String sdate;
}
