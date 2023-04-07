package IO;

import java.io.*;

/*  ByteArrayOutputStream is used to write same data into multiple files 
 *  the data is written into a byte array,  which  can be written to multiple streams later.  
 *  The files can be in different locations. 
 */ 
public class ByteArray_output {
	public static void main(String[] args) throws IOException {
			FileOutputStream fos = new FileOutputStream("D:\\java eclipse\\IO\\TXT file\\bytearray\\bytearray1.txt");
			FileOutputStream fos1 = new FileOutputStream("D:\\java eclipse\\IO\\TXT file\\bytearray\\bytearray2.txt");
			FileOutputStream fos2 = new FileOutputStream("D:\\bytearray3.txt");
			
			ByteArrayOutputStream bout =new ByteArrayOutputStream();
			bout.write(65);
			bout.writeTo(fos);
			bout.writeTo(fos1);
			bout.writeTo(fos2);
			bout.flush();
			bout.close();
			System.out.println("----DONE----");
		}
	}

