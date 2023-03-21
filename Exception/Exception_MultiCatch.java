package Exception_Handling;

// in multi catch exception there are multi catch block
// if the first code has error then only the first catch block will occur 
// if the second code has error and first code is error free then 2nd catch block will occur
public class Exception_MultiCatch{
	static void run() { 
		try {
			// 1st code
			int i =50/0;
			System.out.println(i);
			// 2nd code
			int arr[] = new int[3];
			arr[4] = 34;		
		}
		catch(ArithmeticException a) { // will occur if the 1st code has error and will not execute 2nd   
			System.out.println("Only first airthmetic exception will occur.");
		}
		catch(ArrayIndexOutOfBoundsException ae) { // will only occur if the 1st code is error free
			System.out.println("Now array index out of bound will occur.");
		}
		// finally will must occur it does not depend upon error 
		finally { // finally block will occur for both either their is error or error free
			System.out.println("This is a finally block");
		}
	}
	public static void main(String[] args) {
		run();
	}
}
