import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		
		while (queue.size()>1) {
			queue.poll();
			int k = queue.poll();
			queue.offer(k);
		}
		System.out.println(queue.peek());
	}
	
}
