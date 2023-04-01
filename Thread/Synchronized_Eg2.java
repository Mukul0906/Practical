package Thread;

class GTR {
	synchronized public void display(int num) { // with synchronized method
		for (int i=1;i<=5;i++) {
			System.out.println(num+i);
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {System.out.println(e);
			}	
}
}}
public class Synchronized_Eg2 { // main class
	public static void main(String[] args) { // main method
		GTR u =new GTR();
	// 1st thread object	
		Thread t1= new Thread() {
			public void run() {
				u.display(2);
			}
		};
	// 2nd thread object
		Thread t2 =new Thread() {
			public void run() {
				u.display(50);
			}
		};	
	t1.start();
	t2.start();
	}
}
