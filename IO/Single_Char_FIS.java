package IO;

import java.io.FileInputStream;
//FIS -- file input stream
// external data to replicate on console

public class Single_Char_FIS {
// we can read single character using FIS
	public static void main(String[] args) {
		try {
			// -------- char may be an integer or an alphabet --------
			// take single character from txt source
			FileInputStream fis = new FileInputStream("D:\\java eclipse\\IO\\TXT file\\fis.txt");
		// read single character from source
		int i =	fis.read();{ // it will read from ascii value so int taken so that int can be converted into char
			System.out.println((char)i); // convert it into character 
		}
		fis.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
