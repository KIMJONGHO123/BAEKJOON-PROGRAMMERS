import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        int arr[] = new int[t];
        int arr2[]= new int[t];
        StringTokenizer bw = new StringTokenizer(input.readLine());
        for (int i = 0; i < t; i++){
            arr[i] = Integer.parseInt(bw.nextToken());
        }
        for (int j = 0; j <t ; j++) {
            int h = arr[j] *(j+1);
            int sum =0;
            for (int k = 0; k <j ; k++) {
                sum+= arr2[k];
            }
            int total = h-sum;
            arr2[j] = total;

        }
        for (int w = 0; w < t; w++) {
            System.out.print(arr2[w]+" ");
        }
    }
}
