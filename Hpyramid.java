package ControlStatement;

public class Hpyramid {
	public static void main(String[] args) {
		for(int i=5; i>=1; i--)  // outer loop for row number starting lines
		{
		if (i%2 !=0) { // odd numbers(1,3,5)
			for(int j=5; j>=i; j--) { //odd position print *
				System.out.print(" * ");
			}
			System.out.println();
			}
		}
	for(int i=2; i<=5; i++) { // outer loop for row last 2 line, so its start from 2and then 3,4,5
		if(i%2 !=0) {	// for even
			for(int j=5; j>=i; j--) {
				System.out.print(" * ");
			}
		System.out.println();
		}
	}
}
}