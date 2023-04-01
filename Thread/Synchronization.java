package Thread;
// synchornization -- it allows only one thread to acces to shared resources
// it has the capability ot control acces of multiple thread to any shared resources
// prevents thread interferance and consistency
/* 2 -- 1. mutual exclusive
 * 		2. inter thred communication
*/
 class Thread_Snchronization {
// Synchronization with both with and without synchronization
	
//	public void print(int num) { // without synchronized method
	synchronized public void print(int num) { // with synchronized method
		for (int i=1;i<=5;i++) {
			System.out.println(num*i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {System.out.println(e);
			}		
		}
	}
}
class Thread1 extends Thread{
	Thread_Snchronization ts;
	
	Thread1(Thread_Snchronization ts){
		this.ts=ts;
	}
	public void run() {
		ts.print(5);
	}
}
class Thread2 extends Thread{
	Thread_Snchronization ts;
	
	Thread2(Thread_Snchronization ts){
		this.ts=ts;
	}
	public void run() {
		ts.print(3);
	}
}
public class Synchronization {
	public static void main(String[] args) {
		Thread_Snchronization o = new Thread_Snchronization();
		Thread1 t =new Thread1(o);
		Thread2 t1=new Thread2(o);
		t.start();
		t1.start();
		
	}
}