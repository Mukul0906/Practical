package Lab_2feb;

public class MethodEg {
	public static void main(String[] args) { // main method
		int num1=5;
		int num2=7;
		System.out.println("Numbers are : "+num1+" & "+num2 );
		int c= addition(num1,num2); // call method
		System.out.println("Sum : "+c);
	}

	public static int addition(int num1, int num2) { // method created
		int sum;
		sum=num1+num2;

		return sum ; // return value to c 
	}

	}
