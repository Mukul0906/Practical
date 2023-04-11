package IO;

import java.io.Serializable;
import java.io.*;

class Student implements Serializable {
	int id;
	String name;
	int fees;
	public Student (int id,String name, int fees ) {
		this.id=id;
		this.name=name;
		this.fees=fees;
	}
}
public class ObjectInput_exSerializable {
	public static void main(String[] args) throws Exception {
		ObjectInputStream oi=new ObjectInputStream(new FileInputStream("D:\\java eclipse\\IO\\TXT file\\oi.txt")); 
		Student s = (Student) oi.readObject();
		System.out.println("id :"+s.id+"  Name :"+s.name+"  Fees :"+s.fees);
		oi.close();
	}
}
