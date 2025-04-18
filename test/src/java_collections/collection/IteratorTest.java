package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("aaa", "bbb", "ccc");

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}

		System.out.println("");
		for (String s : list) {
			System.out.print(s + "\t");
		}

		System.out.println("");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
	}

}
