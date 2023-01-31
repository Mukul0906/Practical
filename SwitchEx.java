package ControlStatement;

public class SwitchEx {
	public static void main(String[] args) {
		char ch='a';
		switch (ch) {
			case 'b':
			System.out.println("This code doesn't run");
			break;
			case 'e':
			System.out.println("Something");
		    break;
			case 'f':
			System.out.println("code mismatch");
			break;
			case 'a':
			System.out.println("----code succesfully executes----");
		}
	}
}
