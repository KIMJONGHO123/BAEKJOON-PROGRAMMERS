import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int one = 1;
		int zero = 0;
		int year;
		year = input.nextInt();
		
		if ((year % 4 ==0 && year % 100 !=0) || (year % 400 ==0)) {
			System.out.println(one);
		}
		else {
			System.out.println(zero);
		}
		
	}

}