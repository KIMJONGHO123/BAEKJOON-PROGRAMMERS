import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[100];
		int n = input.nextInt();
		int count =0;
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		int compare = input.nextInt();
		for (int j = 0; j < n; j++) {
			if (arr[j] == compare) {
				count++;
			}
		}
		System.out.println(count);
	}
}