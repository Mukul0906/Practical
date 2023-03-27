package Thread;

// creating thread class by extending Thread Class
public class Thread_eg extends Thread {
	public void run() {
		System.out.println("I am a thread .... thread is running");
	}
	public static void main(String[] args) {
		Thread t = new Thread();
		
	t.start(); // move the thread to running state
	t.setName("Mukul");
	String s = t.getName();
	System.out.println(s);
	}
}
