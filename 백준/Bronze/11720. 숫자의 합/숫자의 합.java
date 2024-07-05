import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t,total=0;
		String n;
		t = input.nextInt();
		n = input.next();

		for (int i = 0; i < t; i++) {
			total += n.charAt(i)-48;
		}
		System.out.println(total);
		
		
	}
}