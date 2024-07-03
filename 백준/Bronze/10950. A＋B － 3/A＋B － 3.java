import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t,num1,num2;
		
		t = input.nextInt();
		for (int i = 0; i < t; i++) {
			num1 = input.nextInt();
			num2 = input.nextInt();
			System.out.println(num1+num2);
		}
		
	}

}