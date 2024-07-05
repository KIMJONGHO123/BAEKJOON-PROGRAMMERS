import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t;
		String str;
		char first,last;
		t = input.nextInt();
		
		for (int i = 0; i < t; i++) {
			str = input.next();
			first = str.charAt(0);
			last = str.charAt(str.length()-1);
			System.out.printf("%s%s\n",first,last);
		
		}
	
	}
}