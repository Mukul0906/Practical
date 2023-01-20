class Student1{ // defining a student class
int slno; // defining feild/ data member/ Instance variable
String name;
}


class Student{ 
public static void main(String...args){ // method of student class
Student1 s = new Student1(); // creating a object
s.slno = 01;
s.name = "Mukul";
System.out.println(s.slno);
System.out.println(s.name);

s.slno = 02;
s.name = "Kumar";

System.out.println(s.slno);
System.out.println(s.name);

s.slno = 03;
s.name = "Denji";
System.out.println(s.slno);
System.out.println(s.name);
 
s.slno = 007;
s.name = "Power";
System.out.println(s.slno);
System.out.println(s.name);
 

}
}