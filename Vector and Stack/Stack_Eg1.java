package Vector_and_Stack;

import java.util.Stack;

public class Stack_Eg1 {
	public static void main(String[] args) {	
		Stack<Integer> s = new Stack<>(); // creating stack class
		System.out.println("Stack is "+s);
		
		// pushing elements by method 
		pushelement(s,20);
		pushelement(s,35);
		pushelement(s,56);
		pushelement(s,45);
		// poping elements by invoking method
		popelement(s);
		popelement(s);
		popelement(s);
		// checking empty stack if yes throws exception
		try {
			popelement(s);
		} catch(Exception e) {
			System.out.println("stack empty");
		}
	}
	// push operation
	private static void pushelement(Stack<Integer> s, int i) { // invoke push method
		s.push(new Integer (i));
		System.out.println("push : "+i);
		System.out.println("Stack is :"+s); // modified stack
	}
	// pop operation
	private static void popelement(Stack<Integer> s) { // invoke pop method
		Integer i = (Integer)s.pop();
		System.out.println("pop: "+i);
		System.out.println("Stack is :"+s); // modified stack
	}
}
