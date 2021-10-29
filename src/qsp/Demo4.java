package qsp;

import java.util.*;

public class Demo4 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List c= new LinkedList();
		c.add(32);
		c.add("lemon");
		c.add(34.4);
		c.add(null);
		c.add(null);
		System.out.println(c);
	}
}