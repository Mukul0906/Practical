package feb_4th_week;

class Num {
	int a=10;
}
class Airthematic extends Num {
	int b=5;
	void show() {
		System.out.println("Numbers are "+super.a+" & "+b);
		System.out.println("Sum is: "+super.a+b);
	}
	void print() {
		System.out.println("Product is: "+super.a*b);
	}
}
public class Super_exa {
public static void main(String[] args) {
	Airthematic sol = new Airthematic();
	sol.show();
	sol.print();
}
}
