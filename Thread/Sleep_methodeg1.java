package Thread;

// sleep -- certain pause in the code
public class Sleep_methodeg1 extends Thread {
	public void run() {
		for (int i=0;i<=5;i++) {
			try {
				Thread.sleep(800); // thread will sleep for 800 milli second
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
}
	public static void main(String[] args) {
		Sleep_methodeg1 s = new Sleep_methodeg1();
		Sleep_methodeg1 s1= new Sleep_methodeg1();

		s.start();
	//  s.start(); a same start method will run only one time other time it will throw exception (illegalthreadexception) 	
		s1.start();
	}
}
