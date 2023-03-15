package String;

import java.util.Scanner;
 // using length method
// length method also counts space 
public class String_Length {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String data =sc.next();
		// first way to find string length
		System.out.println("String length of "+data+" is :"+data.length());
		
		// second way to find string length
//		int len =new x.length();
//		System.out.println("String length of "+data+" is :"+len);
	}
}
