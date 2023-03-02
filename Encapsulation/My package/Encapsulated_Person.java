package mypackage;
/* 	1. if we want to create a fully encapsulated class then we have to make all 
 * 	   the data members of the class as private. 
 *  2. we can use getter and setter method to set and get the data
 */	 	
public class Encapsulated_Person {
	// instance variable
	private String name; 
	private int age;
	// creating getters and setters method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
