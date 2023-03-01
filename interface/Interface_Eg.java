package March_1st;

interface Shape { 
	void shape_name(); // abstract method
}
class Circle implements Shape { // sub class 1
	@Override
	public void shape_name() { 
		System.out.println("Shape is Circle.");
	}	
}
class Triangle implements Shape{ // sub class 2
	@Override
	public void shape_name() {
		System.out.println("Shape is Triangle.");
	}
}
public class Interface_Eg { 	// main class
	public static void main(String[] args) {
		Shape obj=new Circle();
		obj.shape_name();
		Shape obj1=new Triangle();
		obj1.shape_name();	
	}
}
