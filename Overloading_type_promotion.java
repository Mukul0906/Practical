package feb_4th_week;

public class Overloading_type_promotion {
	void add(int a, double b) { //method 1
		System.out.println(a+b);
	}
	void add(int a, double b, float c) { // method 2
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		Overloading_type_promotion d=new Overloading_type_promotion();
		d.add(5, 4); // integer value will be promoted to double
		d.add(8, 2, 6);
	}	
}
// byte---int---short---long-float-double
// char---int---float-double-long