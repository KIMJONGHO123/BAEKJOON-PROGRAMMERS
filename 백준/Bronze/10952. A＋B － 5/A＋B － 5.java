import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1,n2;
		
		while (true) {
			n1 = input.nextInt();
			n2 = input.nextInt();
			
			if (n1 ==0 && n2 ==0) {
				break;
			}
			
			System.out.println(n1+n2);
		}
	}

}