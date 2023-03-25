package Exception_Handling;

// throw keyword is used to throw the exception
// throw unchecked
public class Throw {	
		public static void check(int marks) {
			if (marks<60) {
				// throw syntax = throw keyword the new keyword then exception
				throw new ArithmeticException("Student is not eligible ");
		}
			else {
				System.out.println("Student is eligible");
			}
	}
		public static void main(String[] args) {
			check(50);
		}
}
