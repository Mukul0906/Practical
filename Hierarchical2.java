package Feb_3rd_week;
class Employee{
	int salary=15000;
	int bonus=1500;
	void action() {
		int updatedsal=salary+bonus;
		System.out.println(updatedsal);
	}}
class Engineer extends Employee{
	int benifts=10;
}
class Doctor extends Employee{
	int da=5;
}
public class Hierarchical2 {
	public static void main(String[] args) {
	
	}

}
