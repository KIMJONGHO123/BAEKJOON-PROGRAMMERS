import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int arr[] = new int[10000000];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		int min = arr[0];
		for (int j = 0; j < n; j++) {
			if (min > arr[j]) {
				min = arr[j];
			}
		}
		System.out.print(min+" ");
		
		int max = arr[0];
		for (int p = 0; p < n; p++) {
			if (max<arr[p]) {
				max = arr[p];
			}
		}
		System.out.println(max);
	}
}
