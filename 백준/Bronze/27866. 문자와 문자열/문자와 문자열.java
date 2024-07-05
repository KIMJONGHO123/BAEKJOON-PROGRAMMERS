import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String n;
		n = input.next();
		int index;
		index = input.nextInt()-1;
		
		System.out.println(n.charAt(index));
		
	}

}