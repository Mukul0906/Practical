package Feb_3rd_week;

public class Address {
	String city, state, country;
	public Address(String city, String state, String country) { // parameterized constructor
		this.city=city;
		this.state=state; 	// this directly refers to object
		this.country=country;
	}	
}
