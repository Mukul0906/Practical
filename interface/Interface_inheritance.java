package March_1st;
// inheritance of interface
interface New_Parent { // parent interface
	void show(); 
}
	// interface extend interface using extends keyword
interface New_Child extends New_Parent { // child interface inherits Parent interface 
	void display();
}
class Child1 implements New_Child{ // child class inherits interface using implements keyword
	@Override
	public void show() {
		System.out.println("Parent interface method");	
	}
	@Override
	public void display() {
		System.out.println("Child interface method");	
	}	
}
public interface Interface_inheritance {
	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.show();
		obj.display();
	}
}
