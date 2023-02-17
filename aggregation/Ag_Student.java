package Feb_3rd_week;

public class Ag_Student { // main class
	int id;
	String name;
	Address address; // by aggregating Address class(Reference entity of Address class)
	int phno;	
 // by parameterized constructor
	public Ag_Student(int id, String name, Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display() { // method to display
		System.out.println("ID No.: "+id+"  Name: "+name); // 
		System.out.println("Address : "+address.city+", "+address.state+", "+address.country);
	}
	public static void main(String[] args) {
		Address a1=new Address("Uttam Nagar","New Delhi","India");//object for address print
		Address a2=new Address("Vikas Puri","New Delhi","India");
		Address a3=new Address("Ghaziabad","Uttar Pradesh","India");
		Ag_Student s1=new Ag_Student(1001,"Mukul Kumar",a1); // object for name print
		Ag_Student s2=new Ag_Student(1002,"Abhishek Kumar",a2);
		Ag_Student s3=new Ag_Student(1002,"Bruno",a3);
		s1.display();
		s2.display();
		s3.display();	
	}
}