import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		int array,t,index1,index2;
		
		array = input.nextInt();
		 t = input.nextInt();
		
		int[] arr = new int[array];
	
		for (int i = 0; i < array; i++) {
			arr[i] = i+1;
		}
		
		for (int i = 0; i < t; i++) {
			index1 = input.nextInt()-1;
			index2 = input.nextInt()-1;
			
			while (index1 < index2) {
				int tmp;
				tmp = arr[index1];
				arr[index1] = arr[index2];
				arr[index2] = tmp;
				index1++;
				index2 --;
			}
			
		}
		
		for (int i = 0; i < array; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
	}

}