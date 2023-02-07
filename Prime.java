package Lab_2feb;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		int num,i;
		Scanner sc=new Scanner(System.in); // scanner class created
		System.out.println("Enter the numbers : ");
		
		num = sc.nextInt();
		findprime(num);
	}
	public static void findprime(int num) { // user defined method
		int count=0;
		for (int i=1;	i<=num; i++) {
		if (num%i==0) {
			count++; // temporary input
		}
		}
		if (count==2) {	
			System.out.println(num+" is prime number.");
		}
		else {
			System.out.println(num+" is not prime number.");
		
		}	 
	}
	}

