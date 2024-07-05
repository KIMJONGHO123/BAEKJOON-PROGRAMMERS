import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t;
		double total;
		
		
		t = input.nextInt();
		int [] score = new int[t];
		for (int i = 0; i < t; i++) {
			score[i] = input.nextInt();
		}
		
		int max;
		max = score[0];
		for (int i = 0; i < t; i++) {
			if (max < score[i]) {
				max = score[i];
			}
		}
		total = 0;
		for (int i = 0; i < t; i++) {
			double trans_score = ((double)score[i] / max *100);
			total += trans_score;
		}
		
		System.out.println(total/t);
		
		
	}

}