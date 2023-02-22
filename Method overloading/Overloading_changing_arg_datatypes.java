package feb_4th_week;
// by changing argument data type
public class Overloading_changing_arg_datatypes {
	static int sum(int a,int b) { // integer type arguments/parameters
		return a+b;
	}
	static double sum(double a, double b) { //  double type arguments/parameters
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(Overloading_changing_arg_datatypes.sum(8, 5));
		System.out.println(Overloading_changing_arg_datatypes.sum(-5, -6));
	}	
}
// we cannot change return type in method overloading