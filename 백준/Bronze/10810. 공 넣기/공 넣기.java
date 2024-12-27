import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int arr[] = new int[n];
		int i,j,k;
		for (int v = 0; v < m; v++) {
			i = input.nextInt();
			j = input.nextInt();
			k = input.nextInt();
			for (int l = i; l <=j; l++) {
				arr[l-1] = k;
			}
		}
		for (int u = 0; u < n; u++) {
			System.out.print(arr[u]+ " ");
		}
		
		
		
	}
}
