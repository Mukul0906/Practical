package String;

import java.util.Scanner;

public class String1 {
	String x="Hello"; // literal ( x is the obj of String)
	public void show() {
		// creating scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String A=sc.next(); // user input 1
		String B=sc.next(); // user input 2
		// length method
		System.out.println(A.length()+B.length()); // sum length of words
		// compare method (lexicographically)
		System.out.println((A.compareTo(B)>0)? "Yes" : "No");// compare to () by dictionary letters 
		// sub string (string inside string) to extract words
		//  upper case, lower case 
		System.out.println(A.substring(0, 4).toUpperCase()+A.substring(2)+" "+ 	// (0,4) are start index and end index  
							B.substring(0, 3).toLowerCase()+B.substring(1)); 	//  substring print the word after index position
		
		// substring() a
		System.out.println("Substring is :"+x.substring(0, 3));
		System.out.println("Substring is :"+x.substring(2));
	}
	public static void main(String[] args) {
		String1 to=new String1();
		to.show();
	}
}
