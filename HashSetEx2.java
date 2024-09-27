package com.SetInterface;
/*
 * hash set problem union intersection and difference and subset find 
 */
import java.util.HashSet;

public class HashSetEx2 {

	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		System.out.println("set1 -> "+set1);
		
		HashSet set2 = new HashSet();
		set2.add(1);
		set2.add(3);
		set2.add(6);
		
		System.out.println("set2 -> "+set2);
		
		//finding union U ---> for addAll() used
		
		set1.addAll(set2);
		System.out.println("union U  "+set1);
		
		//finding intersectiion-> retainAll() method is used
		
		set1.retainAll(set2);
		System.out.println("intersection  "+set1);
		
		//print uncommon element -> removeAll() is used
		
		set1.removeAll(set2);
		System.out.println(set1);
		
	}

}
