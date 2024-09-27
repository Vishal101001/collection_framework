package com.QueueInterfaceDemo;

import java.util.PriorityQueue;

	public class PriorityQueueExample {
	    public static void main(String[] args) {
	        
	        PriorityQueue<Integer> pq = new PriorityQueue<>();

	        // Adding elements to the priority queue
	        pq.add(10);
	        pq.add(20);
	        pq.add(15);

	       
	        System.out.println("Head of the queue : " + pq.peek());

	        // Poll elements based on priority (removes them)
	        System.out.println("Removing element: " + pq.poll());
	        System.out.println("Removing element: " + pq.poll());
	        System.out.println("Removing element: " + pq.poll());
	    }
	}
