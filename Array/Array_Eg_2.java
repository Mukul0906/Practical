package March_1st;
// array check every digit contiguous

public class Array_Eg_2 {
	public static void main(String[] args) {
		// Declaration & instantiation
		int num[] =new int[5]; // array index 5 means 5 integers
		// initialization (initializing value)
		num[0]=0;
		num[4]=4;
		num[2]=2;
		num[1]=1;
		num[3]=3;
		// array will print in serialize manner 
	/*	for (int i=0; i<num.length;i++) { // length is one property of array
			// traversing array (print one after one)
			System.out.println(num[i]);
	}
			*/
// another 	method using for each loop		
		for (int i:num) // for each loop 
			// it will check one after another 
			System.out.println(i);
		}	
	}

