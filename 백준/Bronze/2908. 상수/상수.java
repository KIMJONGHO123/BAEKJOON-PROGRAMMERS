import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		int n1,n2;
		n1 = input.nextInt();
		n2 = input.nextInt();
		
		int back1,back2,back3;
		back1 = n1%10;
		back2 = (n1 /10) % 10;
		back3 = (n1/10)/10;
		
		int back4,back5,back6;
		back4 = n2%10;
		back5 = (n2 /10) % 10;
		back6 = (n2/10)/10;
		
		String backward1 = Integer.toString(back1)+Integer.toString(back2)+Integer.toString(back3);
		String backward2 = Integer.toString(back4)+Integer.toString(back5)+Integer.toString(back6);
		
		int finalbackward1 = Integer.parseInt(backward1);
		int finalbackward2 = Integer.parseInt(backward2);
		
		if (finalbackward1 > finalbackward2) {
			System.out.println(finalbackward1);
		}
		else {
			System.out.println(finalbackward2);
		}
		
	}
}