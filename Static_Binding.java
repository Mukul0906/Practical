package March_1st;
// Static binding -- object is determined in compile time.
public class Static_Binding {
 private void display() {
	 System.out.println("Object determined in compile time");
 }
 public static void main(String[] args) {
	Static_Binding op=new Static_Binding();
	op.display();
}
}
