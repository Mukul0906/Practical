package Thread;

public class RunMethod extends Thread{
	public void run() {
		System.out.println("Thread Activated");
	}
	public static void main(String[] args) {
		RunMethod r = new RunMethod();
		r.run(); 
		// without start we can also set and get name
		r.setName("Mukul");
		System.out.println(r.getName());
	}
}
