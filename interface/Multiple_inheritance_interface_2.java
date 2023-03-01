package March_1st;

interface Employee1 { // interface 1
	void salary();
}
interface Developer1 { // interface 2
	void salary(); 
}
class Trainer1 implements Employee1,Developer1 { //sub class

	public void salary() {
		System.out.println("Salary of Trainer is incremented ");
	}	
}
public class Multiple_inheritance_interface_2 { 
	public static void main(String[] args) {
		Trainer1 obj=new Trainer1();
		obj.salary();
	}
}



