package com.arrayOfObject;

class Student{
	int rollno;
	String name;
	String grade;
	
	//constructor
	Student(int rollno, String name, String grade){
		this.rollno=rollno;
		this.name=name;
		this.grade=grade;
		
	}
	//display method
	public void display() {
		System.out.println("student data: "+rollno+" "+name+" "+grade);
	}
}
public class ArrayOfObjects {

	public static void main(String[] args) {
		
		//declare arr of students
		Student [] arr;
		//size
		arr = new Student[3];
		//initilization
		arr[0]=new Student(101,"abc","A");
		arr[1]=new Student(102,"def","B");
		arr[2]=new Student(103,"ghi","C");
		
		System.out.println("first student data:");
		arr[0].display();
		System.out.println("second student data:");
		arr[1].display();
		System.out.println("third student data:");
		arr[2].display();
		
	}

}
