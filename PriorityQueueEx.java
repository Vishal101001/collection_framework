package com.QueueInterfaceDemo;

import java.util.PriorityQueue;


public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue<>();
		//add(ele) --> add the element if queue is full throw exception
		//offer(ele)--> add the element if queue is full return boolean value
		q.add(1);
		q.add(2);
		//q.add('c');   only homogeneous allowed
		q.add(41);
		q.add(5);
		q.add(7);
		System.out.println(q);
		
		//remove()--> remove front/first elem. if Q is full throw exception
		//poll()--> remove front/first elem. if Q is full return null
		q.remove();
		System.out.println("remove first element"+q);
		q.poll();
	    System.out.println("remove first element"+q);	
	    
	    //element()--> return first element (without remove any element)if q=full  throwException
	    //peek()--> return front/first elem. (without remove any ele)if q=full return null

	   
	    System.out.println("return front element with element method"+q.element());
	   
	    System.out.println("return front element with peek method"+ q.peek());
	}

}
