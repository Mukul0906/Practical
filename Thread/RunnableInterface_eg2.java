package Thread;

// Thread(Runnable obj, String name)
public class RunnableInterface_eg2 implements Runnable {
	public void run() {
		System.out.println("Thread running");		
	}
	public static void main(String[] args) {
		Runnable r = new RunnableInterface_eg2();
// creating object of thread class using Thread(runnable object, String name)		
		Thread t = new Thread(r, "Mukul");
		t.start();
		System.out.println(t.getName()); // get name method to get Thread String name
	}

}
