package Exception_Handling;

public class Different_Exception {
	public void show() {
	// all different types of exception should e run one by one
	// because after exception other lines not executed	
	try {
	// Arithmetic exception
		int i =50/0;
		System.out.println(i);
	// null pointer exception
		String s = null;
		System.out.println(s.length());
	// ArrayIndexoutofbound exception
		int arr [] = new int[5];
		arr[7]=10;
	// number format exception	
		String a= "Mukul";
		int n= Integer.parseInt(a);
		System.out.println(n);
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
	public static void main(String[] args) {
		Different_Exception de =new Different_Exception (); 
		de.show();
	}
}
