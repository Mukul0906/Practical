package Core_Java;
	// 3 ways to initialize object in java 	-	By reference variable,	By method, By constructor  
class ObjectEg { // class 2
	int id;			// instance variable
	String name;	// instance variable
}
	class Object { //main class
		public static void main(String[] args) {
			ObjectEg obj=new ObjectEg();	// creating object --- obj is our reference variable
		obj.id=101;
		obj.name="Mukul";
		System.out.println(obj.id+" "+obj.name); // printing members with space
			
		}
		
}
