package Feb_3rd_week;

public class Multilevel2 {
	public static void main(String[] args) {
		Child2 object= new Child2();
		System.out.println("Salary is : "+object.salary);
		System.out.println("Annual salary is : "+object.annualsal);
		System.out.println("Total salary is : "+object.totalsal);
		
	}
}
	class SI_parent3 { // parent class
		int salary=30000; // parent class member/variable
	}
	 // main class
	class Child1 extends SI_parent1 { // child class
		int bonus=2500; // child class member/variable 
		int annualsal=salary+bonus;
		}
	class  Child2 extends Child1 {
	 	int hra=2500;
		int totalsal=annualsal+hra;
	}

