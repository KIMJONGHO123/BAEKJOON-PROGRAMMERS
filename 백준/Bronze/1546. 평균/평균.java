import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());
        double array[] = new double[n];

        for(int i =0; i<n; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        double max= array[0]; // max 값
        for(int k=1; k<n; k++){
            if(array[k]>max){
                max = array[k];
            }
        }

        double sum=0;
        for(int j=0; j<n; j++){
            sum += array[j]/max*100;
        }
        double result = sum/n;
        System.out.print(result);

    }

}
