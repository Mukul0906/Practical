package mypackage;
// we can write only (setter method)
public class Write_Encap {
	private String name;
// setter method
	public void setName() {
	this.name = name;
}
public static void main(String[] args) {
	Write_Encap w=new Write_Encap();
	w.setName(); // compilation error when want to see result
	// we can only set the name but it can not be print
	// Because there is no get method
	System.out.println(w.name);
}
}
