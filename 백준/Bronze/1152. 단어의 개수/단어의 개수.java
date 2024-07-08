import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		int count = 0;
		String s;
		s= input.nextLine().trim();
		
		if (s.isEmpty()) {
			System.out.println(0);
		}
		
		else {
			String[]str = s.split(" ");
			System.out.println(str.length);
		}
		
		
		
	}
}
