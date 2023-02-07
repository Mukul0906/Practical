package Lab_2feb;

public class Parameterizedcons {
	int age;
	String name;
	// parameterized cons where we have to pass the parameter
	Parameterizedcons(int a, String n) {
		age=a;
		name=n;
	}
	void show() {
		System.out.println(age+" "+name); }
	public static void main(String[] args) {
		Parameterizedcons d= new Parameterizedcons (9, "Mukul");
		Parameterizedcons d1= new Parameterizedcons (89,"Power");
		Parameterizedcons d2= new Parameterizedcons (60, "Denji");
		d.show();
		d1.show();
		d2.show();
	}	
	}
