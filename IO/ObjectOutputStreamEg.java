package IO;
import java.io.*;
// Serialization -- writing state of an object into byte stream & the reverse of this is deserialization. 				

// object output stream -- serailiazition (object to byte stream) 
class Student implements Serializable { //seriazable interferance
	transient int id;
	String name;
	transient int fees;
	public Student (int id,String name,int fees) {
		this.id=id;
		this.name=name;
		this.fees=fees;
	}
}
public class ObjectOutputStreamEg { //main clas
	public static void main(String[] args) throws Exception { // main method with exception
	Student s =new Student(101, "Riya", 5000); // object of student class
	FileOutputStream fout = new FileOutputStream("D:\\java eclipse\\IO\\TXT file\\oos.txt"); // file  destination
	ObjectOutputStream oos = new ObjectOutputStream(fout);
	oos.writeObject(s);
	oos.close();
	System.out.println("Writing Done.");
}
}
