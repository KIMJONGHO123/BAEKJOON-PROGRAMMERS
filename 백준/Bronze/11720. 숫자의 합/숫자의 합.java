import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String s = input.next();
		
		int count=0;
		for (int j = 0; j < n; j++) {
			count+=s.charAt(j)-'0';
		}
		System.out.println(count);
	}
}