package Feb_3rd_week;

public class Multilevel {
	public static void main(String[] args) {
		SI_child2 child = new SI_child2(); // object of child class
		child.display();
		child.show();
		child.print();
}
}
class SI_parent2 {	// parent class , super class 
	void show() {
		System.out.println("Show the details");
	}
}
	class SI_child1 extends SI_parent2 { // child class 
		void display() {
			System.out.println("Display the result");
		}
	}
	class SI_child2 extends SI_child1 { // child class 
		void print() {
			System.out.println("Print the result");
		}
			
				}
