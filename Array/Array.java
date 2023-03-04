package March_1st;
// array
public class Array {
	public static void main(String[] args) {
		// initialization,Declaration & instantiation for array
		String [] names= {"Mukul","Arvind","Tushar","Saurav"};
		for (int i=0; i<names.length;i++) { // here length shows variable used
			
			System.out.println(names[i]);
		}
		System.out.println();
		int [] phone= {111,222,333,444,555,666,777,888,999};
		for (int j=0; j<phone.length;j++) {
			System.out.println(phone[j]);
			
		}
	}
}
