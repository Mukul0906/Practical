package mypackage;
// aggregated class for Encapsulated_person
public class Encapsulated_Main {
	public static void main(String[] args) {
		Encapsulated_Person p=new Encapsulated_Person(); // creating object for Encapsulated_Person  
		
		p.setName("Mukul"); // setting name value
		p.setAge(23); // setting age value
		
		System.out.println("Name: "+p.getName()); // getting name
		System.out.println("Age: "+p.getAge());	 // getting age
	}
}
