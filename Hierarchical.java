package Feb_3rd_week;

class Vehicle1 { // parent class
	void running() {
		System.out.println("Running mode on");
	}}
class Car extends Vehicle1{ // child class 1
	void run() {
		System.out.println("Car run mode ON");
	}}
class Bike extends Vehicle1{ // child class 2
	void speed() {
		System.out.println("Bike speed is high");
	}}
public class Hierarchical {
	public static void main(String[] args) {
		Bike b=new Bike(); // object for Bike class
		b.running();
		b.speed();
		Car c=new Car(); // object for Car class
		c.running();
		c.run();
	}
}
