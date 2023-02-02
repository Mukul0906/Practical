package ControlStatement;

import java.util.Scanner;

public class ScannerClass_While_Do_While {
	public static void main(String[] args) {
		int sum =0;
		int number =0;
		
		//scanner class
		Scanner sc = new Scanner(System.in);	// take input from user
		System.out.println("Enter the numbers");
		
		int number1 = sc.nextInt();
		while (number>=0) { 
			sum+=number;
			number = sc.nextInt();
		}
		System.out.println("sum is:"+sum);
		sc.close();
	}
}
