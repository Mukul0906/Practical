package Linked_list;

import java.util.Iterator;
import java.util.LinkedList;

// linkedlist class uses doubly linked list ( double mainpulation -- we can add or delete from both end ) 
// it inherits abstractlist class and implemnts list & deque interface
// contains duplicate value
// maintains the insertion order (same output as input taken)
// pacakage is java.util.linkedlist class 

public class Linkedlist {
	public static void main(String[] args)  {
		
	// 1st list	
		LinkedList<String> ll = new LinkedList<String>(); //create list 1
		ll.add("Mukul");
		ll.add("Rohit");
		ll.add("Saurav");
		ll.add("Tushar");
		ll.add("Arvind");
		ll.add("Kunal");
	System.out.println(ll);
	Iterator<String> itr = ll.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	
	// adding an element at specific position
		ll.add(2, "Nisha"); // add (int index, element)
		System.err.println("After adding : "+ll);
	
	//  2nd list 
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Gaurav");
		ll2.add("Aman");
		ll2.add("Sukh");
		System.out.println("list 2 elements : "+ll2);
	// adding all 2nd list elemnts to 1st list 
		ll.addAll(ll2);
		System.err.println("After adding all elements of list 2 : "+ll);
	// adding all 2nd list elements to 1st list at a specific position
		ll.addAll(2, ll2);
		System.err.println("After adding all elements of list 2 at specific position : "+ll);
	// adding element at first position	
		ll2.addFirst("Students ::");
		System.out.println("Add element at first " +ll2);
	// adding element at last position	
		ll2.addLast("Completed... ");
		System.out.println("Add element at last " +ll2);
	}
	}
	
	
}
