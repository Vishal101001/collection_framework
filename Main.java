package com.ComparableDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		//create array list in Empl.
		
	ArrayList<Employee> a2 = new ArrayList<Employee>();	

	  a2.add(new Employee("aman", 03, 25000));
	  a2.add(new Employee("vishal", 68, 45000));
	  a2.add(new Employee("raja", 48, 35000));
	  
	  //sorting 
	  Collections.sort(a2);
	  
	  //traversing
	  
	  for(Employee obj: a2) {
		  System.out.println(obj.empName+" "+obj.empCode+" "+obj.salary);
	  }
	}

}
