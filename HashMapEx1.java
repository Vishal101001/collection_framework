package com.MapInterfaceDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap<String, Double> Books = new HashMap<String, Double>();

		
		Books.put("science",99.99);
		Books.put("maths",149.00);
		Books.put("english", 299.00);
		Books.put("biology",89.00);
		Books.put("geography",79.99);
		
		System.out.println(Books);
		
		//entry convertion -> we will conver has map to set
		
		Set<Map.Entry<String,Double>> s1 = Books.entrySet();
		
		//using for loop to read data
		
		for(Map.Entry<String, Double> itr : s1) {
			
			System.out.println("entry is :"+itr.getKey()+" "+itr.getValue());
			
			if (itr.getKey().equals("maths")) {
	            itr.setValue(111111.00); // Changing the value of "maths"
	        }
	    }
    System.out.println("Updated Books are: " + Books);
	}

}
