import java.util.*;
public class ExampleForStack {

	public static void main(String[] args) {
		
		Stack<Integer> s= new Stack<Integer>();
		s.push(10);
		s.push(30);
		s.push(70);
		s.push(24);
		
		System.out.println(s);
		
		System.out.println(s.pop());
		
		System.out.println(s);
		
		

	}

}