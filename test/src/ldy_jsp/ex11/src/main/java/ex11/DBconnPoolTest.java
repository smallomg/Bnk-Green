package ex11;

import ex11.DBconnPool;

public class DBconnPoolTest {

	public static void main(String[] args) {
		DBconnPool dbp = new DBconnPool();
		
		dbp.close();
	}

}
