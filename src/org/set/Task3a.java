package org.set;

import java.util.Set;
import java.util.TreeSet;

public class Task3a {
	public static void main(String[] args) {
		Set<Object> l=new TreeSet<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		l.add(90);
		l.add(10);
		l.add(20);
		
		for (Object i : l) {
			System.out.println(i);
			
		}
	}

}
