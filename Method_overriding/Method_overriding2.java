package feb_4th_week;
class Exam{ // parent class
	int marks() {
		return 0 ;
	}}
class comp extends Exam{ // child class
	int marks() {
		return 80 ;
	}}
class maths extends Exam{ // child class 2
	int marks() {
		return 70 ;
	}}
class science extends Exam{ // child class 3
	int marks() {
		return 75 ;
	}}
class english extends Exam{ // child class 3
	int marks() {
		return 84 ;
	}}
public class Method_overriding2 {
	public static void main(String[] args) {
		// same name method calling by different child object 
/*		comp c=new comp();
		maths m=new maths();
		science s=new science();
		english e=new english();
		System.out.println("Computer marks are "+c.marks());
		System.out.println("Maths marks are "+m.marks());
		s.marks(); // will not print because sop not given
		e.marks();
*/
		Exam sh; // making reference variable of parent class		( sh is reference variable )
		sh= new comp();
		System.out.println("Computer marks are "+sh.marks());
		sh= new maths();
		System.out.println("Maths marks are "+sh.marks());
		sh= new science();
		System.out.println("Science marks are "+sh.marks());
		sh=new english(); // will not print because no print command
	
}}
