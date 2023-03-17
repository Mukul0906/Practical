package String;

public class Mmutable_String {
	public static void show() {
		// string buffer
		
		StringBuffer sb = new StringBuffer("Hello"); 
		sb.append(" World");
		System.out.println("String is : "+sb);
		sb.insert(2, "MUKUL");
		System.out.println("After inserting : "+sb);
		sb.replace(1, 3, "java");
		System.out.println("Capacity is :"+sb.capacity());
	
	// String Builder
		StringBuilder sb1= new StringBuilder("World");
		sb1.replace(1, 3, "java");
		System.out.println("After replacing : "+sb1);
		sb1.delete(1, 3);
		System.out.println("After deleting : "+sb1);
		sb1.reverse();
		System.out.println("After reversing : "+sb1);
	}
	public static void main(String[] args) {
		show();
	}
}
