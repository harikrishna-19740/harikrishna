

import java.util.*;



public class ExampleForArrayDeque {

	public static void main(String[] args) {
		//Deque d = new ArrayDeque();
		ArrayDeque<Integer> d = new ArrayDeque<Integer>();
		d.add(95);
		d.add(67);
		d.add(37);
		
		System.out.println(d);
		
		System.out.println("-----------------------------------");
		
		
		System.out.println(d.poll());
		
		System.out.println("-----------------------------------");
		
		for(Object i : d)
		{
			System.out.println(i);
		}
		
		System.out.println("-----------------------------------");
		
		
		System.out.println(d.remove(37));
		
		System.out.println("-----------------------------------");
		
		System.out.println(d);
		
		

	}

}