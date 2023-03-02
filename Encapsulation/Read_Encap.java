package mypackage;
// we can read only (getter method)
public class Read_Encap {
	private String name="Mukul"; // instance variable
	// get name
	public String getName() {
		return name;
	}
public static void main(String[] args) {
	Read_Encap s=new Read_Encap(); // object for Read_Encap
//	s.setName("Raghu"); not change value because setName method is not provided
	
	System.out.println("Name: "+s.getName());
}	
}
