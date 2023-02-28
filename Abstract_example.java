package March_1st;

abstract class Parent {
	Parent(){ // default constructor
		System.out.println("Non args Constructor");
	}
	abstract void show(); // abstract method
	void run() { // non abstract method
		System.out.println("Non abstracter method");
	}
}
class Child extends Parent{
	@Override
	void show() { // override abstract method
		System.out.println("Method body");
	}
}
public class Abstract_example  {
	public static void main(String[] args) {
		Parent obj=new Child();
		obj.show();
		obj.run();
	}
}
