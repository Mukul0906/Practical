package Thread;

public class Current_Thread_Name extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Current_Thread_Name t = new Current_Thread_Name();
		Current_Thread_Name t1= new Current_Thread_Name();
	
		t.start();
		t1.start();

	}}

