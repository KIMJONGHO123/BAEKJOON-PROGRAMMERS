import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum=1;
        int left=1;
        int right=1;
        int count=0;

        while(left<=n){

            if(sum == n){
                count++;
            }
            if(sum>=n){
                sum-=left;
                left++;
            }
            else if(sum<n){
                right++;
                sum+=right;
            }
        }
        System.out.print(count);
    }
}