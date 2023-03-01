package March_1st;

interface ParentInterface { // interface
	// no need to write abstraction
	void show(); // by default abstraction method	

	default void display() { // default method
		System.out.println("Default method");
	}
	static void print() { // static method
		System.out.println("Static method");
	}
}
class Interface implements ParentInterface { // class implements interface instead of extends
	@Override
	public void show() {
		System.out.println("Parent Interfacce method.");
	}
public static void main(String[] args) { 
	Interface ob=new Interface(); // child class object
	ob.show();
	ob.display(); // default method
	ParentInterface.print();// static method always called by class/interface name 
}	
}
