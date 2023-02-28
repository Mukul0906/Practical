package March_1st;
// Dynamic binding -- object is determined in run time.
class Base { // base class
	void show() {
		System.out.println("Is it shown");
	}
}
public class Dynamic_binding extends Base { // sub class 
	void show() {
		System.out.println("Not shown because it is in run time.");
	}
	public static void main(String[] args) {
		Dynamic_binding db=new Dynamic_binding(); // object
		db.show();
	}
}
