package Exception_Handling;

public class Throw_ex2 {
	// defining static method
	static void checknum(int num) {
		if (num<0) {
			throw new ArithmeticException("Number is negative");
		}
		else {
			System.out.println(num+" : Number is positve");
		}
	}
	public static void main(String[] args) {
		checknum(5); // static method no need to create object
	}
}
