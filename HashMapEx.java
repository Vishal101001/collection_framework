package com.MapInterfaceDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> hs = new HashMap<Integer,String>();

		//add
		hs.put(10, "aman");
		hs.put(20, "ravi");
		hs.put(30, "vishal");
		hs.put(40, null);
		hs.put(null, "raja");
		
//		System.out.println(hs);
		
		//get(key)
//		System.out.println(hs.get(10));
		
		//remove
		
//		System.out.println(hs.remove(40));
		//after remove key 40 value null will removed
//		System.out.println(hs);
		//containsKey()
//		System.out.println(hs.containsKey(30));
		//containsValue()
//		System.out.println(hs.containsValue(30));
		
		//isEmpty()
//		System.out.println(hs.isEmpty());
		System.out.println(hs);
		//size
//		System.out.println(hs.size());
		
		//clear()
//		hs.clear();
//		System.out.println(hs);
		
	System.out.println(hs.entrySet());	
	
	//map convert to set 
	
	Set<Map.Entry<Integer,String>> s = hs.entrySet();
	
	//for reading single entry in map interface
	
	for(Map.Entry<Integer, String> it : s) {
		System.out.println("first entry "+it.getKey()+" "+it.getValue());
	}
	
	}

}
