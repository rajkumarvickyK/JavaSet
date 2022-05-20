package org.set;


import java.util.Set;
import java.util.TreeSet;

public class Task5b {
	public static void main(String[] args) {
		Set<Integer> li = new TreeSet<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(70);
		li.add(80);
		System.out.println(li);
		
		Set<Integer> i = new TreeSet<>();
		i.add(100);
		i.add(200);
		i.add(300);
		i.add(400);
		i.add(500);
		i.add(600);
		i.add(700);
		i.add(8000);
		
		System.out.println(i);
		
		li.removeAll(i);
		System.out.println("REMOVE ALL VALUE\n==============");
		System.out.println(li);
	}

}
