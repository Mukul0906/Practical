package Array;
// two matrix addition
public class Add_Array {
public static void main(String[] args) {
	int a[][]= {{1,2},{3,4}}; // matrix 1
	int b[][]= {{1,5},{3,5}}; // matrix 2
// create new matrix for storing result(addition) 	
	int c[][]=new int [2][2];
// logic for printing row and column	
		for (int i=0;i<2;i++) { // for printing row
		for (int j=0;j<2;j++) { // for printing column
// logic for matrix sum			
	c[i][j]=a[i][j]+b[i][j];
	System.out.print(c[i][j]+" ");
		}
	System.out.println();
}
}}
