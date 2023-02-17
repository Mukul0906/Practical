package Feb_3rd_week;

class AgEg { // class 1
	int square(int r) { // method name square 
		return r*r; // return
	}}
// area of circle pi*r*r
public class Aggregation_circle { // class 2
	double pi=3.14;
	double area(int radius) { // area method variable radius
		AgEg ag=new AgEg(); // ag ref. variable to make object of class 1
		int psquare=ag.square(radius); // radius*radius by square
		// psquare stores the radius *radius  
		return pi*psquare; // returns value of pi*psquare to area method
	}
	public static void main(String[] args) {
		Aggregation_circle c=new Aggregation_circle();
		double result=c.area(10); // (area=radius*radius
		System.out.println("Area of circle : "+result);
}
}
