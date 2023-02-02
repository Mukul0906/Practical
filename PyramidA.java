package ControlStatement;

public class PyramidA {
	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) { // outer loop for row numbers
			for(int j=5; j>=i; j--) { // inner loop for space before *
				System.out.print(" ");
			}
			for (int j = 1; j<=i; j++) { // inner loop for *
				System.out.print(" *");
			}
		System.out.println();	// for new line	
				
				
			}
		}
	}
