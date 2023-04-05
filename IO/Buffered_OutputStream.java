package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/* write information in the bufferedoutputstream object 
  which is connected to the FileOutputStream object */
public class Buffered_OutputStream {
	public static void main(String[] args) {
		try {
 // we conncet one stream (FileOutputStream) with another stream (Buffered outpur stream)			
			FileOutputStream fos = new FileOutputStream("D:\\java eclipse\\IO\\TXT file\\bufferedops.txt");
			BufferedOutputStream bo = new BufferedOutputStream(fos);
			String si = "Welcome to India.";
			byte by[] = si.getBytes(); // convert string into byte array
			fos.write(by);
			fos.flush(); // flushes the data of one stream and send it to another stream
			fos.close();
			bo.close();
			System.out.println("done");
		} catch(Exception e) {
			System.out.println(e);
		}	
	}
}
