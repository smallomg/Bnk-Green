package javatest;

import java.util.HashMap;
import java.util.Map;

public class Repository {

	public static void main(String[] args) {
		
		ZenericRepository<String> zr1 = new ZenericRepository<>();
		ZenericRepository<Integer> zr2 = new ZenericRepository<>();
		ZenericRepository<Character> zr3 = new ZenericRepository<>();
		
		int i = 10;
		String s = "string";
		char c = 'c';
		
		zr1.list.add(s);
		System.out.println(zr1.list.get(0));
		
		
		Map<Integer, String> map =new HashMap<>();
		// key : 번호
		// value : 이름
		map.put(1,"a");
		map.put(2,"b");
		map.put(3,"c");
		map.get(1);
		System.out.println(map.get(1));
		System.out.println(map.get(3));
	}

}
