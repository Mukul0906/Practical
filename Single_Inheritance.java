package Feb_3rd_week;

class SI_parent {	// parent class , super class 
	void show() {
		System.out.println("Show the details");
	}
}
	class SI_child extends SI_parent { // child class , sub class
		void display() {
			System.out.println("Display the result");
		}
	}
		public class Single_Inheritance{
			public static void main(String[] args) {
				SI_child child = new SI_child(); // object of child class
				child.display();
				child.show();
				}
		}

