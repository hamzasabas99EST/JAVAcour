package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Trie1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(24);
		list.add(10);
		list.add(52);
		list.add(2);
		Collections.sort(list);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		   System.out.println(it.next());
	}
}




