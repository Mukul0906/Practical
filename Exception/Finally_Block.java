package Exception_Handling;

// finally block will execute if their is an exception or not the finally block must execute
// 
public class Finally_Block {
	public static void main(String[] args) {
	// exception will not occur	
		try {
			int a=4/2;
			System.out.println(a);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		// exception will occur
		try {
			int a= 4/0;
			System.out.println(a);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		// exception occur but will not handled
		try {
			int a= 4/0;
			System.out.println(a);
		}
		catch(NullPointerException e) {
			System.out.println(e);		
		}
		finally {
			System.out.println("Finally code will always excecute");
		}
	}

}
