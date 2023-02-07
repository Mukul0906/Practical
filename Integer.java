package Core_Java;

import java.util.Scanner;

public class Integer {
 public static void main(String[] args) {
	 Scanner a = new Scanner(System.in);
		System.out.println("Enter 1st Integer");
		System.out.println("Enter 2nd Integer");
		int input = a.nextInt(); 
		int n1 = input;
		int input1=a.nextInt();
		int n2 = input1;
		if (n1>n2) {
			System.out.println("The 1st Integer. is Maximum = " + n1);
			System.out.println( "The 2nd Integer. is Minimum =" + n2);
		}
		else if (n2>n1) {
			System.out.println("The 2nd Integer is Maximum ="+n2); 
			System.out.println( "The 1st Integer. is Minimum =" + n1);
			}
		else  {
			System.out.println("Error 404");
		}
		
}
}
