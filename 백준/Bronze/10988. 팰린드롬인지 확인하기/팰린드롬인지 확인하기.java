import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s = input.next();	
		char[] str = new char[s.length()] ;
		int count=0;
		
		for (int i = s.length()-1; i >= 0; i--) {
			str[count] = s.charAt(i);
			count++;
		}
		
		String equalstr = new String(str);
		if (equalstr.equals(s)) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
	}
}