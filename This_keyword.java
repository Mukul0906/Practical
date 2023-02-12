package Core_Java.Week2Feb;

class This_keyword1{
	// instance variable
	int id;
	String ename;
	double salary;
	// parameterized constructor
	This_keyword1(int id, String ename,double salary ){
		this.id=id;
		this.ename=ename;
		this.salary=salary;
	}
// 	method
void display() {
	System.out.println(id+" "+ename+" "+salary);
}
public class This_keyword {
	public static void main(String[] args) {
		// objects
		This_keyword1 d1= new This_keyword1(101,"Mukul",35000);
		This_keyword1 d2= new This_keyword1(103,"Arvind",35000);
		d1.display();
		d2.display();
	}

}
}