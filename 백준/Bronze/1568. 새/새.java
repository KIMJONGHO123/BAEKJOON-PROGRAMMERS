import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int count=1;
        int time=0;
        while(true){
            n-=count;
            time++;
            if (n==0){
                break;
            }
            count++;
            if (n < count){
                count =1;
            }
        }
        System.out.println(time);
    }
}
