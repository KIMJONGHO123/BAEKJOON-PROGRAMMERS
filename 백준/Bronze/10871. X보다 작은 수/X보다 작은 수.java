import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	int arr[] = new int[10000];
	int n = input.nextInt();
	int x = input.nextInt();
	for (int i = 0; i < n; i++) {
		arr[i] = input.nextInt();
		
	}
	for (int j = 0; j < n; j++) {
		if (arr[j] < x) {
			System.out.printf("%d ",arr[j]);
		}
	}
	

	}
}