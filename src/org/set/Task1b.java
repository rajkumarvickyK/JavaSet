package org.set;


import java.util.Set;
import java.util.TreeSet;

public class Task1b {
	public static void main(String[] args) {
		
		Set<Object> s =new TreeSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(80);
		s.add(90);
		s.add(10);
		s.add(20);
		
		System.out.println(s);
	}

}
