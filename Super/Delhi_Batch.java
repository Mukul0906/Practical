package feb_4th_week;

class Batch { //parent class
	//parent class property (data member/variable))
	int id;
	String name;
	double fees;
	//parent class cons
Batch (int id,String name,double fees){
		this.id = id;
		this.name = name;
		this.fees = fees;
	}}
class BatchMember extends Batch {
long phone_no; // child class property
	BatchMember(int id,String name,double fees,long phone_no){
		super(id, name, fees); //reusing parent constructor
		this.phone_no = phone_no;
	}
		void show () {
			System.out.println(id +" "+name+" "+fees+" "+phone_no);
			}}
class DelhiBatch{
	public static void main(String[] args) {
		BatchMember obj = new BatchMember (07,"Mukul",10000,123456789);
				obj.show();
	}	
}
