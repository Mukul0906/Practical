package String;

public class Immutable_String {
	public static void main(String[] args) {
		String str = "Mukul";
		str.concat("kumar"); // it will not print because string is immutable
		System.out.println(str); // so it will print mukul only
		// it can be done by another method
		// by creating same object we can concat data in the previous obj
		str=str.concat(" kumar"); 
		System.out.println(str); // it wil print mukul kumar
	}
}
