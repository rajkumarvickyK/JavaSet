package org.set;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task2b {
	public static void main(String[] args) {
		List<Object>li=new ArrayList<>();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		li.add(100);
		li.add(300);
		li.add(500);
		
		System.out.println(li);
		
		Set<Object> l=new TreeSet<>();
		l.addAll(li);
		System.out.println(l);
	}

}
