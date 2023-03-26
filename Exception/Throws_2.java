package Exception_Handling;

import java.io.IOException;
// checked exception
// throws only used with method signature 
public class Throws_2 {
	void display() throws IOException{
		System.out.println("throws ioexception error"); // exception not shown
		throw new IOException ("throws exception error"); // to throw exception
 }
	public static void main(String[] args) throws IOException { // throws declaration added
		Throws_2 th = new Throws_2();
		th.display();
	}
}
