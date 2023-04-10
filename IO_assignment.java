package IO;

import java.util.Scanner;
import java.io.*;

public class IO_assignment {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1 to store data:");
		int i =in.nextInt();
	// for storing data
		if (i==1) {
			FileOutputStream fos = new FileOutputStream("E:\\Know.txt");
			String s ="Program for stroing and writing data. "; 
			byte b[] = s.getBytes(); 
			fos.write(b); 
			fos.close();
			System.out.println("Storing data completed in the file destination.");	
			}
		else { System.out.println("Wrong keyword only 1 allowed.");
		}
		System.out.println("Enter 2 to write data:");
		int j=in.nextInt();
	// for writing data	
		if (j==2) {
				// file source
				FileInputStream fis = new FileInputStream("E:\\Know.txt");
				int k=0;
				while((i=fis.read())!=-1) { // loop for take all characters 
					System.out.print((char)i); // convert i into char 
				}
				fis.close();
		}
		else { System.out.println("Wrong keyword only 2 allowed.");
		}
		}
}
