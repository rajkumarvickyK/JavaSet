package org.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task3 {
	public static void main(String[] args) {
		Set<Object> li=new LinkedHashSet<>();
		li.add(105);
		li.add(205);
		li.add(305);
		li.add(405);
		li.add(505);
		li.add(605);
		li.add(705);
		li.add(805);
		
		for (Object object : li) {
			System.out.println(object);
			
		}
	}

}
