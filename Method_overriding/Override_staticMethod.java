package feb_4th_week;

class Base { // parent class    - 2 methods add() non-static and print() static
	// non static method will be override in child class
	public int add(int a, int b) {
		System.out.println("In the base class");
		return a+b;
	}
	//  static method will not be override in child class
	public static void print() {
		System.out.println("In the base class");
	}
	}
class Derived extends Base { // child class
	// base class method add() will be overridden because non-static
	public int add(int a, int b) {
		System.out.println("In the child class");
		return a+b;
	}
	public static void print() {
		System.out.println("In the child class");
}
}
public class Override_staticMethod {
	public static void main(String[] args) {
		// here derived method add() will called
		Base obj = new Derived();
		System.out.println(obj.add(4, 7));
		// here derived class method add() will called because static method can't be overridden
		// it will show Base print instead
		obj.print();
	}
}
