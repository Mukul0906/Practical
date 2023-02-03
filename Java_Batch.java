package Core_Java;
 // how to define a class & field (data members/ variable)
public class Java_Batch {
	// defining fields (instance variables) 
	int id;
	String Bname;
	public static void main(String[] args) {
		// create object
		Java_Batch jb= new Java_Batch();
		Java_Batch jb1= new Java_Batch(); // new object for another value
		// print value
		jb.id=1;
		jb.Bname="C4119";
		jb1.id=2;
		jb1.Bname="C4120";
		System.out.println("Id is: "+jb.id+"Batch Name: "+jb.Bname);
		System.out.println("Id is: "+jb1.id+"Batch Name: "+jb1.Bname);
	}
}
