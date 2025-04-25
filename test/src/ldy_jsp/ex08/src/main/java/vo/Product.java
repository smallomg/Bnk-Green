package vo;

import lombok.Data;

@Data
public class Product {
	String pcode;
	String pname;
	int cost;
	int discount10;
	int discount15;
}
