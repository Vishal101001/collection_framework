package com.ComparableDemo;
/*
 * comparable (single
 * only one condition sort
 * 
 * implement interface
 * 
 * constructor
 * override compareTo() method
 * calling main
 * */
public class Employee implements Comparable<Employee> {

	//data
	
	String empName;
	int empCode;
	int salary ;
	
	//constuctor
	
	Employee(String empName, int empCode, int salary){
		this.empName= empName;
		this.empCode=empCode;
		this.salary=salary;
	}

	@Override
	public int compareTo(Employee o) {
		if(salary==o.salary)
		return 0;
		else if(salary>o.salary)
		return 1;
		else {
			return -1;
		}
	}
	
	
	
}
