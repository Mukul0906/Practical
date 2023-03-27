package Exception_Handling;

public class Without_catch_finally {
	public static void main(String[] args) {
		
		int arr [] = new int[3];
		try {
			arr[7]=3;
			System.out.println(arr[1]);
		}
		finally { // finally block executed without giving catch block
			arr[3]=7;
			System.out.println(arr[3]);
			System.out.println("Finally block ");
		}
	}
}
