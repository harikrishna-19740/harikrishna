

import java.util.*;

/*
 * Queue -->pre-defined interface in java.util
 * First in first out LinkedList,PriorityOrder for PriotrityQueue
 * Duplicates are allowed
 * Elements cant't be accessed by index
 */




public class ExampleForQueueInterface {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		System.out.println(pq);
		
		System.out.println("-----------------------------------");
		
		for(Object i : pq)
		{
			System.out.println(i
					);
		}
		
		System.out.println("-----------------------------------");
		
		System.out.println(pq.poll());
		
		

	}

}