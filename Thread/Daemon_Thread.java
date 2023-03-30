package Thread;

// demon thread provides the services to the user thread
// many daemon thread automatically like garbage collector and finalizer
// user thread life depend on daemon thread
// jvm terminates daemon thread if there is no user thread 
public class Daemon_Thread extends Thread {
	public void run() {
	if(Thread.currentThread().isDaemon()) {
		System.out.println(Thread.currentThread().getName());
		System.out.println("I am Daemon");
	}
	else {
		System.out.println("I am user");
	}
}
	public static void main(String[] args) {
	Daemon_Thread dt =new Daemon_Thread();	
	Daemon_Thread dt1=new Daemon_Thread();	
	Daemon_Thread dt2=new Daemon_Thread();
	dt.setDaemon(true);
	dt2.setDaemon(true);
	dt.start();
	dt1.start();
	dt2.start();
	}
}
