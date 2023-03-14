package String;

import java.util.Scanner;

public class String_equality {
	public static void main(String[] args) {
		
		String str1,str2;
		// creating scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string :");
		str1=sc.next(); // user input 1
		System.out.println("Enter second string :");
		str2=sc.next(); // user input 2
		
		// comparing two input string 
		
	//	if (str1.equals(str2)) // compare original content of string
	//	if (str1==str2) // compares reference not value
		if (str1.compareTo(str2)>0) // compare according to dictionary
			System.out.println("Equal strings"); // if string b at small pos
		else
			System.out.println("Unequal strings"); // if string a at small pos
			
		
	}
}
