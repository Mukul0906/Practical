package Exception_Handling;

import java.util.Scanner;

public class Exception_inputMismatch {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter two integers : ");
		try { 
			int x= in.nextInt();
			int y= in.nextInt();
			System.out.println("Result is :"+ x/y);
		}
		catch (Exception e) {
			System.out.println(e);
		}		
}
}
