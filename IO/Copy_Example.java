package IO;

import java.io.IOException;
import java.io.*;

public class Copy_Example {
	public static void main(String[] args) throws IOException{
		FileInputStream fin = new FileInputStream("D:\\java eclipse\\IO\\TXT file\\copyexample.txt");
		FileOutputStream fout = new FileOutputStream("D:\\java eclipse\\IO\\TXT file\\bytearray\\tocopy.txt");
		byte arr[] =new byte[1024];
		int l;
		while((l=fin.read(arr))>0) {
			fout.write(arr);
		}
		fin.close();
		fout.close();
		System.out.println("copy completed");
	}
}
