package Feb_3rd_week;

class Brand{
	String Brand="TATA";
	String Model="Punch";
	void display() {
		String u=Brand+" "+Model;
		System.out.println(u);
	}}
class Model1 extends Brand{
	int price=500000;
}
class Model2 extends Brand{
	int cost=600000;
}
public class Heirarchical3 {
	public static void main(String[] args) {
		Model1 p=new Model1();
		p.display();
		System.out.println("Price : "+p.price);
		Model2 c=new Model2();
		c.display();
		System.out.println("Price : "+c.cost);	
	}
}
