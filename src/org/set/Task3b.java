package org.set;

import java.util.HashSet;
import java.util.Set;

public class Task3b {
	public static void main(String[] args) {
		Set<Object> li = new HashSet<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(70);
		li.add(80);
		li.add(90);
		li.add(10);
		li.add(20);
		for (Object i : li) {
			System.out.println(i);
			
		}
	}

}
