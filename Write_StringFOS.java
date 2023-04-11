package IO;

import java.io.FileOutputStream;

public class Write_StringFOS {
	// write byte to string using fos -- write string with file output
	public static void main(String[] args) {
		try{
			// shows destination of the empty txt file
			FileOutputStream fos = new FileOutputStream("D:\\java eclipse\\IO\\TXT file\\tobyte.txt");
			// write byte to string
			fos.write(77); // byte (Ascii value) A starts from 65
			fos.close();
			System.out.println("Completed");
		} catch(Exception e) { // to show exception
			System.out.println(e);
		}
	}
}
