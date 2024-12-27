import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[9];
		
		for (int i = 0; i < 9; i++) {
			arr[i] = input.nextInt();
			
		}
		int max = arr[0];
		int count = 0;
		for (int j = 0; j < 9; j++) {
			if (max < arr[j]) {
				max = arr[j];
				count = j;
			}
		}
		System.out.println(max);
		System.out.println(count+1);
	}
}