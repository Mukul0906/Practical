package Thread;

public class Sleep_Methodeg2 {
	// inside main method sleep is used
	public static void main(String[] args) {
		try {
			for(int i=0;i<=5;i++) {
				Thread.sleep(500);
				// Sleep value cannot be in negative it will throw an exception
				System.out.println(i);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
