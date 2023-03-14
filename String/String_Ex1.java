package String;

public class String_Ex1 {
public void show(){  // method 1
	char [] arr= {'m','u','k','u','l'}; // char type array  (char array works same as java string)
	System.out.println(arr);
	String s=new String(arr); // using new keyword to create String object
	System.out.println("value is "+s);
}
	public void myFunction() { //method 2 
		String m1 = "Java"; // using literals (double coat:"") is used to create object
		String m2 = "Java";//  it does not create any object // because already present in data
		// to make memory efficient no new object created if data is present in pool 
 	//	String s2=new String(m1);
		System.out.println(m1);
	}
	public static void main(String[] args) {
		String_Ex1 str =new String_Ex1();
	str.show();
	str.myFunction();		
	}	
}

