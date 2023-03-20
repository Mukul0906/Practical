package Exception_Handling;

public class Exception1 {
	public void display() {
		String a = "I am error";
		System.out.println(a);
		try {  // try keyword : where exception may occur
			int i =50/0; //  throw arithmetic exception
			System.out.println(i);
			// after exception occurs further lines will not executed
			String s =" mukul";
			System.out.println(s); // will not execute			
		}
		catch (Exception c) { // catch keyword , handle the exception
			System.out.println(c); // exception c will show which type of exception occurs in code
			// in catch user can also provide code 
		}
	// after try-catch block	
		String b =" i can't handle";
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Exception1 ex = new Exception1();
	ex.display();
}
}
