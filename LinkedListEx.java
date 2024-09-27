package com.linkedlistDemo;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
	
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		
//		System.out.println(l1.size());
		
		l1.addFirst(10);   //[10] last me add hoga 
		l1.addFirst(20);   //[20,10]
		l1.addFirst(30);   //[30,20,10]
		l1.addLast(null);
		
		
		
		System.out.println(l1);
		
		for(int i=0; i<l1.size();i++) {
			System.out.print(l1.get(i)+"->");
		}
		
//		l1.removeFirst();   //[20,10] first se remove hoga
//		System.out.println(l1);
//		
//		
//		l1.removeLast();
//		System.out.println(l1);
		

	}

}
