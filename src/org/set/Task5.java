package org.set;

import java.util.HashSet;
import java.util.Set;

public class Task5 {
	public static void main(String[] args) {
		Set<Integer> li = new HashSet<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		System.out.println(li);
		
		Set<Integer> i = new HashSet<>();
		i.add(30);
		i.add(40);
		i.add(50);
		i.add(60);
		i.add(80);
		
		System.out.println(i);
		
		li.removeAll(i);
		System.out.println("REMOVE ALL VALUE\n==============");
		System.out.println(li);
	}
}
