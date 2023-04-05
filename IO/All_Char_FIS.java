package IO;

import java.io.FileInputStream;
// to read whole character 
public class All_Char_FIS {
	public static void main(String[] args) {
	try {
		// file source
		FileInputStream fis = new FileInputStream("D:\\java eclipse\\IO\\TXT file\\fis.txt");
		// i=0 because starting pos
		int i=0;
		while((i=fis.read())!=-1) { // loop for take all characters 
			System.out.print((char)i); // convert i into char 
		}
		fis.close();
	} catch(Exception e) {
		System.out.println(e);
	}
}
}
