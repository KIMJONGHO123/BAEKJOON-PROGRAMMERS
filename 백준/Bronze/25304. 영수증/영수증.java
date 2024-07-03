import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int receipt_price,t,price,count,total_price=0;
		
		receipt_price = input.nextInt();
		t = input.nextInt();
		for (int i = 0; i < t; i++) {
			price = input.nextInt();
			count = input.nextInt();
			total_price += price * count;
		}
		if (total_price == receipt_price) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}