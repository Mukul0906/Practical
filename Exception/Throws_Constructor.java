package Exception_Handling;

public class Throws_Constructor {
	String name;
	int age;
	// parameterized constructor
	public Throws_Constructor(String name, int age) throws Exception{
	this.name=name;
	this.age= age;
	if (age<18) {
		throw new Exception ("Age must be above 18");
	}	
}
	public static void main(String[] args) throws Exception {
		Throws_Constructor tc = new Throws_Constructor("Mukul",23);
		System.out.println(tc.age+" "+tc.name);		
	}
}
