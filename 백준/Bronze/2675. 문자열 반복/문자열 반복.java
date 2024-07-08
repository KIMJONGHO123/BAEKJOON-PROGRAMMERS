import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t,r;
		String s;
		
		t = input.nextInt();
		
		for (int i = 0; i < t; i++) {
			r = input.nextInt();
			s = input.next();
			
			
			for (int j = 0; j < s.length(); j++) {
				for (int j2 = 0; j2 < r; j2++) {
					char c = s.charAt(j);
					System.out.printf("%c", c);
					
				}
				
			}
			System.out.printf("\n");
			
		}
	}
}