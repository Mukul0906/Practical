package Polymorphisim;
// imp:: run time polymorphism can't be achieved by the data members
// it is only achieved by method
public class Runtimepoly {
	public static void main(String[] args) {
		Papa papa; // ref. variable of parent class
		papa =new Child(); 
		System.out.println(papa.Priority);
		
	}
}
class Papa { // parent class
	String Priority= "High";
}
class Child extends Papa { // child class
	String Priority="Super High";
}