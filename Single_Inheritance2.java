package Feb_3rd_week;

class SI_parent1 { // parent class
	int salary=30000; // parent class member/variable
}
 // main class
public class Single_Inheritance2 extends SI_parent1 { // child class
	int bonus=2500; // child class member/variable 
	int annualsal=salary+bonus;
	public static void main(String[] args) {
		Single_Inheritance2 object= new Single_Inheritance2();
		System.out.println("Salary is : "+object.salary);
		System.out.println("Annual salary is : "+object.annualsal);
	}

}
