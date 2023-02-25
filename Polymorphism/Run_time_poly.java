package Polymorphisim;

public class Run_time_poly {
public static void main(String[] args) {
	JavaStudent js;
	js=new Mukul();
	System.out.println("Quality of Mukul is "+js.quality());
	js=new Arvind();
	System.out.println("Quality of Arvind is "+js.quality());
	js=new Saurav();
	System.out.println("Quality of Saurav is "+js.quality());
	js=new Tushar();
	System.out.println("Quality of Tushar is "+js.quality());
}
}
class JavaStudent {
	String quality() {
		return null;
	}
}
class Mukul extends JavaStudent { // child class 1
	String quality() {
		return "Artistic";
	}
}
class Saurav extends JavaStudent { // child class 2
	String quality() {
		return "knowledge";
	}
}
class Tushar extends JavaStudent {	// child class 3
	String quality() {
		return "Friendly";
	}
}
class Arvind extends JavaStudent { // child class 4
	String quality() {
		return "Adventures";
	}
}