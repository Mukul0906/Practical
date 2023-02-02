package ControlStatement;

public class DoWhileOdd {	//find fist 10 even numbers
	public static void main(String[] args) {
		int i=1; // because it is a do while loop statement is printed at least once
		System.out.println("First ten odd numbers");
		do {
			System.out.println(i);
			i=i+2;
		}while(i<=20 );	
		}
	}

