package Thread;

// directly we can also use thread class without extending
// we can get name with or without set name :
public class Thread_eg2 {
	public void run () { // run method of thread class
		System.out.println("Thread eg 2");
	}
public static void main(String[] args) {
	// creating an object of thread class using thread constructor
	Thread t = new Thread ("Mukul"); // without set name (parameterized constructor)
	Thread t1 = new Thread(); // with set name
	// to get void run method parameters 
/*	Thread_eg2 t3 = new Thread_eg2();   
	t3.run();
	*/
	t.start();
	t1.start();
	t1.setName("Anudip");
	System.out.println("Thread 0 : "+t.getName());
	System.out.println("Thread 1 : "+t1.getName());
}
}
