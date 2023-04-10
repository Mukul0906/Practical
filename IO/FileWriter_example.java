package IO;

import java.io.FileReader;

public class FileWriter_example {
	public static void main(String[] args) throws Exception{
		
		FileReader fr = new FileReader("E:\\Java IO text\\do.txt");
		
		int i =0;
		while((i=fr.read())!=-1) {
		System.out.print((char)i);
		}
		fr.close();
		System.out.println("Done");
	}
}
