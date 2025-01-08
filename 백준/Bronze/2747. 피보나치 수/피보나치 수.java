import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int [46];
        arr[0] = 0;
        arr[1] = 1;
        int n = Integer.parseInt(input.readLine());
        for (int i = 2; i <= n; i++) {
            arr[i]=arr[i-2] + arr[i-1];
            
        }
        System.out.println(arr[n]);
    }
}
