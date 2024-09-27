package com.arrayOfObject;

class Employee{
	String name;
	int id;
	int salary;
	Employee(String name, int id, int salary){
		this.name=name;
		this.id= id;
		this.salary=salary;
	}
	public void empInfo() {
		System.out.println("employee data: "+name+" "+id+" "+salary);
	}
}
public class ArrayOfObjEx1 {

	public static void main(String[] args) {
	
		//declare arry of Employee
		Employee [] arr1;
		//size
		arr1= new Employee[3];
		//initilization
		arr1[0] = new Employee("ram",101,24000);
		arr1[1] = new Employee("shyam",102,24000);
		arr1[2] = new Employee("pawan",103,24000);
		
		System.out.println("first emp data:");
		arr1[0].empInfo();
		System.out.println("second emp data:");
		arr1[1].empInfo();
		System.out.println("third emp data:");
		arr1[2].empInfo();
	}

}
