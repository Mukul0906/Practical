package Exception_Handling;

// throw  - exception declared is by our own (user data) 
//		  - used within the method
// throws - 
// 		  - used method signature
public class Throws_Ex {
	// whether the student is pass or not
	static void display (int n) throws ArithmeticException{
		if (n>=0 && n<35) {
			// throw arithmetic exception if num less than 35
			throw new ArithmeticException("Student is fail");
		}
		else {
			System.out.println("Student is pass");
		}
	}
	public static void main(String[] args) {
		// calling method
		display(39);
	}
}
