package Vector_and_Stack;

import java.util.Stack;

/* stack -- * used to store collection object based on lifo (last in first out)
 			* empty stack -- there is no element ( if nothing is ther then it is -1)
 			* iterable --> collection --> listin
mostly used method -- push(), peek(), pop(), search(), empty()	*/

public class Stack_Example {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>(); // creating stack class
		// checking stack empty or not 
		boolean chk = s.empty();
		System.out.println("Is the stack is empty : "+chk);
		
		// adding elements push()
		s.push(45); 
		s.push(54);
		s.push(36);
		s.push(89);
		s.push(15);
		s.push(23);
		s.push(11);
		s.add(4, 60); 
		// in stack the postion of 11 is 0 , because of 
		
		System.out.println("Stack elements :-"+s); // print stack collection
		Integer digit = s.peek(); // access element from top of the stack 
		System.out.println("Top element :"+digit);
		System.out.println("Stack elements after pick :"+s);
		Integer digit1 = s.pop();
		System.out.println("Top element :"+digit1);
		System.err.println("Stack elements after pop :"+s);
		Integer digit2 = s.search(89); // search element out of stack
		System.out.println("Search element :"+digit2);
		int x = s.size(); // size of stack
		System.out.println("Size of stack :"+x);
		chk = s.empty(); // checking stack empty or not 
		System.out.println("Is the stack is empty : "+chk);
	}
}
