package March_1st;
//anonymous array
// no need to declare array inside method
public class Anonymous_array {
	static void print(int arr[]) { //method receives an array as argument / parameter
		for (int i=0; i<arr.length; i++)
			System.out.println(arr[i]);	
	}
	public static void main(String[] args) {
		print(new int [] {10,20,30,40,50,60,70}); // passing anonymous array to method print
		
	
}
}
