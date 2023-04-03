package Thread;
/* If thread class is not extending the thread class the object is also not treated as thread object.
 * So we need to create thread class object explicitly
 * we are passing object of our class which implements runnable so that class run method will execute
 * but will not start.
 */ 
public class RunnableInterface implements Runnable {
	public void run() {
		System.out.println("I am thread .... and I am running");
	}
public static void main(String[] args) {
	RunnableInterface ri = new RunnableInterface (); // obj created for RunnableInterface which implements Runnable
	Thread t = new Thread(ri); // thread class object created to execute run() method
	
	t.start();
}
}
