package mypackage;
 // 2nd class aggregated by bank class 
public class Customer {
	public static void main(String[] args) {
		Bank b=new Bank();
		// setting values
		b.setAc_no(12345678);
		b.setName("Mukul");
		b.setEmail("mukul@bank.com");
		b.setAmount(15000);
		// getting values
		System.out.println("Account no.: "+b.getAc_no());
		System.out.println("Name: "+b.getName());
		System.out.println("Customer Email: "+b.getEmail());
		System.out.println("Amount: Rs."+b.getAmount());
	}
}
