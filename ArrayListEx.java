package com.listInterfaceDemo;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
	//hetro type list declaration
		
		ArrayList a1 = new ArrayList();
		a1.add(100);
		a1.add('c');
		a1.add(true);
		a1.add("hi");
		a1.add(2.5);
		a1.add(null);
		System.out.println(a1);
		System.out.println(a1.get(2));
		a1.set(2,"welcome");
		System.out.println(a1);
		System.out.println(a1.contains("java"));
		for(Object o : a1){
		System.out.println("traverse:  "+o);
		
		}
		
	}

}
