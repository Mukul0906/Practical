package Core_Java.Week2Feb;

class Staticmethod{
	//instance variable
	int rollno;
	String name;
	float fee;
	static String college="GITAM"; // static variable
	// static void method to change the value of static variable
	static void change() { // static method
		college="GTC"; }
		
// parameterized constructor
Staticmethod (int rollno, String name, float fee){ // parameterized constructor
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
}
// user defined method
void givemesomeeye() {
	System.out.println(rollno+" "+name+" "+fee+" "+college);
}
public class Staticmethod1 {
	public static void main(String[] args) {
		// calling static method with class name
		// no need to create object for static method
	Staticmethod.change();
	// creating object
	Staticmethod s1=new Staticmethod(101,"Mukul",45000);
	Staticmethod s2=new Staticmethod(102,"Arvind",55000);
	Staticmethod s3=new Staticmethod(103,"Saurav",45000);
	s1.givemesomeeye();
	s2.givemesomeeye();
	s3.givemesomeeye();
	}
}
}
