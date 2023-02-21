package feb_4th_week;

/*
class Shape1{ // parent class
	void show() {
		System.out.println("It is a circle");
	}
}
class Size1 extends Shape1 { // sub class
	void show() { // same method as 
		System.out.println("It is a triangle");
	}
	void print() {
		System.out.println("It is nothing");
	}
	void display() {		
	super.show(); // refers immediate parent class data
	show();
	print();
}}
public class Super_method {
	public static void main(String[] args) {
		Size1 s1=new Size1();
		s1.display();
	}
}	*/
					//	OR	//
class Shape1{ // parent class
	void show() {
		System.out.println("It is a circle");
	}
}
class Size1 extends Shape1 { // sub class
	void show() { // same method as parent class
		System.out.println("It is a triangle");
		super.show(); // represent parent class method 
	}
	void print() {
		System.out.println("It is nothing");
	}
}
public class Super_method {
	public static void main(String[] args) {
		Size1 s1=new Size1();
		s1.show();
		s1.print();
	}
}
