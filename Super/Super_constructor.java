package feb_4th_week;

class A { // base class
	A()	{ // constructor of base class
		System.out.println("Hello");
	}
}
class B extends A { // sub class
	B(){ // constructor of sub class
	//	super(); // invoke immediate base class constructor body 
	//	if super is not written than the complier will automatically provide super constructor 
		System.out.println("Hi");
	}
}
public class Super_constructor {
	public static void main(String[] args) {
		B obj=new B();
	//  A obj=new A(); // only represents Hello
}
}