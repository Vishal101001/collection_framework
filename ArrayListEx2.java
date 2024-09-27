package com.listInterfaceDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList a3 = new ArrayList();
		a3.add(75);
		a3.add(700);
		a3.add(10);
		System.out.println("a3: "+a3);
		//addAll method
		ArrayList a3_duplicate = new ArrayList();
		a3_duplicate.addAll(a3);
		System.out.println(a3_duplicate);
		
		a3_duplicate.removeAll(a3_duplicate);
		System.out.println(a3_duplicate);
		
		//sort collections sort
		Collections.sort(a3);
		System.out.println("after sorting: "+a3);
		
	
	}
}
