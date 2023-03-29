package Thread;
// thread scheduler is a component 
// scheduler decide which thread to execute and which thread to wait if there are more than one thread
// 
public class Thread_Priority extends Thread {
	public void run() {
		for (int i=1;i<=5;i++) {
			try {
				Thread.sleep(700);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Thread_Priority t = new Thread_Priority();
		Thread_Priority t1= new Thread_Priority();
		Thread_Priority t2= new Thread_Priority();
		
		t2.setPriority(MIN_PRIORITY);
		System.out.println(t2.getPriority());
		System.out.println(Thread.currentThread().getPriority()+" "+Thread.currentThread()); 
		// normal priority(5) is displayed by default
		t.start();
		t1.start();
		t2.start();
		t1.setName("MUKUL");
		System.out.println(t1.getName());
	}

}
