import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t;
		t = input.nextInt();
		
		for (int i = 1; i <= t; i++) {
			for (int j = 1; j <= t-i; j++) {
				System.out.printf(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}

}