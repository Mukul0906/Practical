package Lab_2feb;

public class Con_1 {

	int age;
	String name;
	void show() {
		System.out.println(age+" "+name);}
	public static void main(String[] args) {
	Con_1 d= new Con_1();
	
	Con_1 d1= new Con_1();
	d.show();
	d1.show();
	Con_1 d2= new Con_1();
	d2.age=101;
	d2.name="Boy";
	System.out.println(d2.age+" "+d2.name);
		
	}
}
