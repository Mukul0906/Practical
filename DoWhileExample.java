package ControlStatement;

public class DoWhileExample {	//find fist 10 even numbers
	public static void main(String[] args) {
		int i=2; // because it is a do while loop statement is printed at least once
		System.out.println("First even numbers until ");
		do {
			System.out.println(i);
			i=i+2;
		}while(i<=10 );	
		}
	}

