import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int king=1,queen=1,look=2,bee=2,night=2,phone=8;
		
		int iking,iqueen,ilook,ibee,inight,iphone;
		
		iking = input.nextInt();
		iqueen = input.nextInt();
		ilook = input.nextInt();
		ibee = input.nextInt();
		inight = input.nextInt();
		iphone = input.nextInt();
		
		System.out.print(king-iking+" ");
		System.out.print(queen-iqueen+" ");
		System.out.print(look-ilook+" ");
		System.out.print(bee-ibee+" ");
		System.out.print(night-inight+" ");
		System.out.println(phone-iphone);
		
	}
}