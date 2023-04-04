package IO;

import java.io.FileOutputStream;

// java input output stram
// process input and produce output

public class Write_ByteFOS {
// FOS -- file output stream
// write string to byte array -- write byte with file output
	public static void main(String[] args) {
		try{
			// shows destination of the empty txt file
			FileOutputStream fos = new FileOutputStream("D:\\java eclipse\\IO\\TXT file\\fos.txt");
			String s ="Welcome to Anudip Foundation"; // string to be converted into byte
			byte b[] = s.getBytes(); // converting string into byte array
			fos.write(b); // obj of fos and bytearray name
			fos.close();
			System.out.println("Completed");
		} catch(Exception e) { // to show exception
			System.out.println(e);
		}
}
}
