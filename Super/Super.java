package feb_4th_week;


class Shape{ // parent class
	String name="Circle"; // data member of parent class
}
class Size extends Shape { // child class
	String name="No size";	// data member of child class
	void show() { // child class method
		System.out.println(name); // to represent child class
		System.out.println(super.name); // it represents immediate parent class data
	}
}
public class Super {
	public static void main(String[] args) {
		Size s=new Size();
		s.show();		
	}
}
