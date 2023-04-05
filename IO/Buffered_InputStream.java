package IO;

import java.io.*;
// read the data from my source file by using BufferedInputStream
public class Buffered_InputStream {
	public static void main(String[] args) {
		try {
			// source file
			FileInputStream fis = new FileInputStream("D:\\java eclipse\\IO\\TXT file\\bufferedips.txt");
			BufferedInputStream bi = new BufferedInputStream(fis);
			 
			int i;
			while((i=bi.read())!=-1) {
				System.out.print((char)i);
			}
			// flush method not neede because we do not need to write anything
			fis.close();
			bi.close();		
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
