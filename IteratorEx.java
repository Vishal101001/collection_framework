package com.IteratorDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();

		list1.add("node");
		list1.add("python");
		list1.add("java");
		
		Iterator<String> itr = list1.iterator();
		
		while(itr.hasNext()) {
			//hasNext() --> it is used to if ele is present or not 
			//next()--> it is used to iterate as loop...
			String element = itr.next();
			System.out.println(element);
			
		}
	}

}
