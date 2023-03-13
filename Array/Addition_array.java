package Array;

public class Addition_array {
	public static void main(String[] args) {
		// create matrix
		int a[][]= {{1,2,3},{3,4,5}};
		int b[][]= {{1,2,2},{3,1,5}};
		// for creating another matrix
		int c[][]=new int [2][3]; // matrix for two row three column
		
	// logic for printing row and column
		for (int i=0;i<2;i++) {
		for(int j=0;j<3;j++) {
	// logic for sum		
	c[i][j]=a[i][j]+b[i][j];
	System.out.print(c[i][j]+" ");
		}
	System.out.println();
	}
	}

}
