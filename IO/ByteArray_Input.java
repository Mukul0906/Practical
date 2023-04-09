package IO;

import java.io.ByteArrayInputStream;
// read byte array from input stream
public class ByteArray_Input {
	public static void main(String[] args) {
	byte arr[] = { 68, 53, 75, 70, 37, 45}; // byte array
	ByteArrayInputStream bais = new  ByteArrayInputStream(arr);
	int i =0; // for starting pos
	while ((i=bais.read())!=-1) {
		char ch = (char)i; // convert ascii value into char value
		System.out.println("For Ascii character "+i+" value is :"+ch);		
	}
}
}
