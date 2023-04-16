package String;
// Represent any object to string 
// return the value of the object instead hascode
public class To_String {
	// instance variables 
	int rollno ;
	String name, addr;
	// parameterized constructor
	To_String (int rollno, String name, String addr) {
		this.rollno=rollno;
		this.name=name;
		this.addr=addr;
	}
	// no need to create a void method to call object 
	public String tostring() { // return object to string
		return rollno+" "+name+" "+addr;
	}
	public static void main(String[] args) {
		To_String s1 =new To_String (1,"Mukul","Delhi"); // return the has code value of an object
		To_String s2 =new To_String (2,"Golu","Uttar Pradesh");
		
	System.out.println(s1);
	System.out.println(s2);
	}
}
