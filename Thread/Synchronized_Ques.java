package Thread;


class Question {
synchronized public void print(int num) { // with synchronized method
	int s =num;
	for (int i=1;i<=5;i++) {
		System.out.println(s+i);
		try {
			Thread.sleep(100);
		}
		catch(Exception e) {System.out.println(e);
		}	
}
}}
class T1 extends Thread{ //class extending thread class
	Question s;
	
	T1(Question s){
		this.s=s;
	}
	public void run() {
		s.print(5);
	}
}
class T2 extends Thread{ //class extending thread class
	Question s;
	
	T2(Question s){
		this.s=s;
	}
	public void run() {
		s.print(3);
	}
}
class T3 extends Thread{ //class extending thread class
	Question s; // obj created
	
	T3(Question s){
		this.s=s;
	}
	public void run() {
		s.print(20);
	}
}
public class Synchronized_Ques {
	public static void main(String[] args) {
	Question  ou = new Question();
	T1 to =new T1(ou);
	T2 to1=new T2(ou);
	T3 to2=new T3(ou);
	to.start();
	to1.start();
	to2.start();

}
}
