package feb_4th_week;

class TestOverriding { // base class
	void run() { // method 1
		System.out.println("Run mode on");
	}
} 
// defining same name method declared in base class 
public class Method_overriding extends TestOverriding{ // sub class
	void run() { // method 2
		System.out.println("Run mode off");
	}
	public static void main(String[] args) {	
		Method_overriding m=new Method_overriding(); // child class object created
		m.run();
	}
}
