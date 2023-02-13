package Core_Java.Week2Feb;

class Staticvariable1 { // class 
	// instance variable
	int rollno;
	String name;
	float fee;
	static String college="GITAM"; // static variable
	
	Staticvariable1(){ // default constructor
		
	}
	Staticvariable1 (int rollno, String name, float fee){ // parameterized constructor
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display() { //method
	System.out.println(rollno+" "+name+" "+fee+" "+college);
    }
	public class Staticvariable{ // main class // main object
	public static void main(String[] args) {
		//	objects
	
		Staticvariable1 s1=new Staticvariable1(101,"Mukul",45000);
		Staticvariable1 s2=new Staticvariable1(102,"Arvind",55000);
		Staticvariable1 s3=new Staticvariable1(103,"Saurav",45000);
		Staticvariable1 s4=new Staticvariable1(103,"Tushar",50000);
		Staticvariable1 s5=new Staticvariable1(); // default constructor object
		s1.display(); // method
		s2.display();
		s3.display();
		s4.display();
		s5.display();
		
	}
	}
}
