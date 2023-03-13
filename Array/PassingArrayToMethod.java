package March_1st;

import java.lang.reflect.Array;

public class PassingArrayToMethod {
	
	static void maximumNo(int array[]) { // method for max number
		int max= array[0];
		for (int i=1; i<array.length; i++)
		if (max<array[i]) 
			max=array[i];
		System.out.println("Maximum no. in array is "+max);
		}

	static void minimumNo(int array[]) { // method for min number
		int min= array[0];
		for (int i=1; i<array.length; i++)
		if (min>array[i]) 
			min=array[i];
		System.out.println("Minimum no. in array is "+min);
		}
	
	public static void main(String[] args) {
		// initializing & declaration of array
		int arr[]= {5,7,9,2,5,11};
		maximumNo(arr);
		minimumNo(arr); 
		
	}
}
