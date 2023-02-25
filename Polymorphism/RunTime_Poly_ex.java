package Polymorphisim;
// run time polymorphism
public class RunTime_Poly_ex { // main class
public static void main(String[] args) {
	Employee es; //Reference variable
	es = new Developer();
	System.out.println("Increased percentage of salary for Developer is "+es.IncreasedSalary()+"%s");
	es = new Manager();
	System.out.println("Increased percentage of salary for Developer is "+es.IncreasedSalary()+"%");
}
}
class Employee { // parent class
	int IncreasedSalary() { 
		return 0;
	}
}
class Developer extends Employee { // child class 1
	int IncreasedSalary() {
		return 10;
	}
}
class Manager extends Employee { // child class 2
	int IncreasedSalary() {
		return 15;
	}
}