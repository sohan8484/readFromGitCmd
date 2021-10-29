package qsp;

import java.util.HashSet;
import java.util.Iterator;

public class Demo5 {
public static void main(String[] args) {
	HashSet<Integer> h=new HashSet<Integer>();
	h.add(34);
	h.add(67);
	h.add(99);
	h.add(23);
	h.add(11);
	Iterator<Integer> itr=h.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
