package org.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
	public static void main(String[] args) {
		
	List<Object> li=new ArrayList<>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(90);
	li.add(10);
	li.add(10);
	li.add(40);
	li.add(50);
	System.out.println(li);
	
	
	Set<Object> s=new HashSet<>();
	s.addAll(li);
	System.out.println(s);
	}

}
