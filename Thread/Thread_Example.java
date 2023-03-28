package Thread;

public class Thread_Example extends Thread{
	public void run() {
		for (int i = 0; i<5; i++) {
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(i);
	}
}
	public static void main(String[] args) {
		// object decide the number of intervals
		Thread_Example t = new Thread_Example();
		Thread_Example t1= new Thread_Example();
		Thread_Example t2= new Thread_Example();
		
		t.start(); // 1st interval
		try {
			t.join();		
		} 
		catch (InterruptedException e) {
			System.out.println(e);
		}
		t1.start(); // 2nd interval
		try {
			t1.join();		
		} 
		catch (InterruptedException e) {
			System.out.println(e);
		}
		t2.start(); // 3rd interval
		try {
			t2.join();		
		} 
		catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
