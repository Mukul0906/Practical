package String;
import java.util.StringTokenizer;

// used to break string into parts
public class String_Tokenizer {
	public static void show() { //manual method
		// StringTokenizer is a predefined class present in java.lang.string
		StringTokenizer t = new StringTokenizer ("Anudip foundation skill and career development center"," ");
		while (t.hasMoreTokens()) { // boolean checks if there are more tokens
			System.out.println(t.nextToken(" ")); // method returns the string after the " " 
		}
		StringTokenizer st = new StringTokenizer ("I am Mukul & staying in Delhi");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken("&"));
}}
	public static void main(String[] args) {
		show();
	}
}
