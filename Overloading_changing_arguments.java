package feb_4th_week;
// method Overloading - same name method with different arguments
// method overloading can be done by :-
// 1. by changing no. of arguments
// 2. changing data type of method
public class Overloading_changing_arguments{

	static int sum(int a,int b) { // two arguments/parameters
		return a+b;
	}
	static int sum(int a, int b, int c) { //  three arguments/parameters
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println(Overloading_changing_arguments.sum(5, 6));
		System.out.println(Overloading_changing_arguments.sum(4, 5, 4));
	}	
}
