package March_3rd_week;

import java.util.regex.*;


public class Regex {
	public static void main(String[] args) {
	// 	1st way
		Pattern p =Pattern.compile(".s");
		Matcher m =p.matcher("ks");
		boolean b =m.matches();
		
	//  2nd way
		boolean b2 =Pattern.compile("..s").matcher("sks").matches();
		
	//  3rd way
		boolean b3 = Pattern.matches("...s","oabs");
		
		System.out.println(b+"  "+b2+"  "+b3 );
	}

}
