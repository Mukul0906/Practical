package Vector_and_Stack;

import java.util.Vector;

// similar to arraylist 
// it is synchronized 

public class Vector_Example {
	public static void main(String[] args) {
		// creating vector
		Vector<String> vc = new Vector<String>();
		// adding elements to vector
		vc.add("Dog");
		vc.add("Cat");
		vc.add(0, "Tiger");
	
	// checking size of capacity
		System.out.println("Size :"+vc.size());
		System.out.println("Capacity :"+vc.capacity()); // by default capacity is 10
		// add more elements
		vc.addElement("cow");
		vc.addElement("goat");
		System.out.println("After adding elements :");
		System.out.println("Size after adding :"+vc.size());
		System.out.println("Capacity after adding :"+vc.capacity());
		
		// checking cat is present in the vector or not
		if (vc.contains("Cat")) {
			System.out.println("Element present.");
		}else {
			System.out.println("Element not present.");
		}
		// gettiing 1st element
		System.out.println("1st element :"+vc.firstElement());
		// gettiing last element
				System.out.println("last element :"+vc.lastElement());
		// check index of specified element
				System.out.println("Index :"+vc.indexOf("Cat"));
	}
}
