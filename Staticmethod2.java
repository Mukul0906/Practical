package Core_Java.Week2Feb;

public class Staticmethod2 {
	static int add(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		int c= Staticmethod2.add(20, 45);
		System.out.println(c);
	}
}
