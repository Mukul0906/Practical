package March_1st;

abstract class Abstract_EX {
	abstract void show();// abstract method
	
	void display() { // non abstract method
		System.out.println("Non absract method invoke");
	}
}
class Demo1 extends Abstract_EX { // sub class 1
	void show() {
		System.out.println("Demo1 method invoked");
	}
}
class Demo2 extends Abstract_EX {	// sub class 2
	void show() {
		System.out.println("Demo2 method invoked");
	}
}
	public class Abstract_method {
		public static void main(String[] args) {
			Demo1 d1=new Demo1();
			Demo2 d2=new Demo2();
			d1.show();
			d2.show();
			d2.display();	
		}
}
