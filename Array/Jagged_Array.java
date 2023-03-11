package Array;
// jagged array
// odd number of column is known as jagged array
public class Jagged_Array {
public static void main(String[] args) {
	// declaring no. of row 3 but column kept blank
	int arr[][]=new int[5][];
	// defining column 
	arr[0]=new int [3];
	arr[1]=new int [6];
	arr[2]=new int [9];
	arr[3]=new int [6];
	arr[4]=new int [3];
	// initializing jagged array
	int count=0;
	for (int i=0;i<arr.length;i++) // for row
	for (int j=0;j<arr[i].length;j++) // for column
	arr[i][j]=count++;
	// print the jagged array
	for (int i=0;i<arr.length;i++) {
	for (int j=0;j<arr[i].length;j++) {
	System.out.print(arr[i][j]+" ");
}
	System.out.println();
}}}
