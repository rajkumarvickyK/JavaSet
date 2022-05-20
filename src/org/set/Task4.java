package org.set;

import java.util.HashSet;
import java.util.Set;

public class Task4 {
	public static void main(String[] args) {
		
		Set<Object> li=new HashSet<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		System.out.println(li);
		
		Set<Object> i=new HashSet<>();
		i.add(30);
		i.add(40);
		i.add(50);
		i.add(60);
		i.add(80);
		System.out.println(i);
		
		System.out.println("COMMAN VALUES\n===========");
		
		li.retainAll(i);
		System.out.println(li);
		
	}

}
