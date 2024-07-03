import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int hour,minute, take_minute;
		
		hour = input.nextInt();
		minute = input.nextInt();
		take_minute = input.nextInt();
		
		if (minute+take_minute > 59) {
			hour = hour+(minute+take_minute)/60;
			
			minute = (minute+take_minute)%60;
			if (hour >=24) {
				hour = hour -24;
			}
			System.out.printf("%d %d",hour,minute);
		}
		else if (minute+take_minute<60) {
			System.out.printf("%d %d",hour,minute+take_minute);
		}
		
	}

}