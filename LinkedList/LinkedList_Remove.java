package Linked_list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Remove {
public static void main(String[] args) {
	
	// 1st list	
			LinkedList<String> ll = new LinkedList<String>(); //create list 1
			ll.add("Mukul");
			ll.add("Rohit");
			ll.add("Saurav");
			ll.add("Tushar");
			ll.add("Arvind");
			ll.add("Kunal");
		System.out.println("List 1 elements :"+ll);	
	//  2nd list 
			LinkedList<String> ll2 = new LinkedList<String>();
			ll2.add("Gaurav");
			ll2.add("Aman");
			ll2.add("Sukh");
			System.out.println("list 2 elements : "+ll2);
			
	// adding new elemnts
			ll.addAll(ll2);
			System.out.println("After adding new element :"+ll);
			// remove specific element from 1st
			ll.remove("Rohit");
			System.out.println("After removing -Rohit- :"+ll);
			// removing specific element from 1st on the basis of position
			ll.remove(1);
			System.out.println("After removing from specific position:"+ll);
			// removing all new elemets
			ll.removeAll(ll2);
			System.out.println("After removing all new elements :"+ll);
			

			
			//adding new elements to list 1
			ll.add("Pallabi");
			ll.add("ANUDIP");
			ll.add("JAVA");
			ll.add("Collection");
			ll.add("Pallabi");
			System.out.println("Updated list elements :"+ll);
			// remove First Occurrence
			ll.removeFirstOccurrence("Pallabi");
			System.out.println("Removing first occurance :"+ll);
			// remove last Occurrence
			ll.removeLastOccurrence("Pallabi");
			System.out.println("Removing last occurance :"+ll);
			
			// transversing the list of elements in reverse order
			Iterator i = ll.descendingIterator();
			while(i.hasNext()) {
			System.out.println(i.next());
			}
			// remove all elements 
			ll.clear();
			Iterator<String> itr = ll.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
}
}