package March_1st;
// multiple inheritance only used in interface
// multiple inheritance more than one parent class/interface
interface Employee { // interface 1
	void salary(); // abstract salary method
}
interface Developer { // interface 2
	void bonus();
}
class Trainer implements Employee,Developer { //sub class
	@Override
	public void bonus() {
		System.out.println("Bonus for developer is 10% of salary");	
	}
	@Override
	public void salary() {
		System.out.println("Salary of employee is incremented ");
	}	
}
public class Multiple_inheritance_Interface {
	public static void main(String[] args) {
		Trainer obj=new Trainer();
		obj.salary();
		obj.bonus();
	}
}
