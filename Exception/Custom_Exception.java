package Exception_Handling;

// for creating custom exception 
class InvalidAgeException extends Exception { // ---\
	public InvalidAgeException (String str) { // ----> mandatory lines for creating custom exception
		super(str);							  // ---/	
	}					
}
public class Custom_Exception {
	static void checkage(int age) throws InvalidAgeException {
		if (age <25) {
			throw new InvalidAgeException("Age must be 25 or above");
		}
	}
	// 1st method without try catch block
	public static void main(String[] args) throws InvalidAgeException {
	checkage(23);
	
// 2nd method with try catch block	
//	public static void main(String[] args) {
//		try {
//			checkage(16);
//		}
//		catch(InvalidAgeException e) {
//			System.out.println(e);
//	}
}
}
