package org.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task4a {
	public static void main(String[] args) {
		Set<Integer> li=new LinkedHashSet<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		System.out.println(li);
		
		Set<Integer> i=new LinkedHashSet<>();
		i.add(10);
		i.add(20);
		i.add(60);
		i.add(50);
		i.add(40);
		i.add(70);
		i.add(80);
		i.add(90);
		System.out.println(i);
		
		li.retainAll(i);
		System.out.println("COMMAN VALUES\n============");
		System.out.println(li);
		
		
		
		
	}

}
