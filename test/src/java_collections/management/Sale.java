package management;

import lombok.Data;
import java.sql.Date;

@Data
public class Sale {
	private int sa_code;
	private Date sa_date;
	private int sa_stock;
	private int sa_cost;
	private int sa_total;
	private int c_code;
	private int p_code;
	private int s_code;
}
