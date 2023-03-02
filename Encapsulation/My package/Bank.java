package mypackage;
// Bank class aggregated for Customer
public class Bank {
	private String name,email;
	private float amount;
	private long acc_no;
	// generating getter setter method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public long getAc_no() {
		return acc_no;
	}
	public void setAc_no(long ac_no) {
		acc_no = ac_no;
	}
}
