package Inheritance;

import java.util.ArrayList;

public class Infinity_Array_main {

	public static void main(String[] args) {

		/*
		 * InfinityObjectArray ioa = new InfinityObjectArray();
		 * 
		 * // ioa.objs[0] = "hello";
		 * 
		 * ioa.add("aaa"); // 0번 인덱스 aaa ioa.add("bbb"); // 1번 인덱스 bbb ioa.add("ccc");
		 * // 2번 인덱스 ccc ioa.add("ddd"); // 3번 인덱스 ddd
		 * 
		 * ioa.showArray();
		 */
		
		
		
		
		ArrayList sList1[] = new ArrayList[3];
		
		ArrayList<String> sList2 = new ArrayList<>();
		
		int idx = 0;
		
		sList2.add("1");
		sList2.add("2");
		for(int i = 0;i<sList1.length;i++) {
			sList1[i] = sList2;
			
		}
		for(int i = 0;i<sList1.length;i++) {
		System.out.println(sList1[i]);
		}
	}

}
