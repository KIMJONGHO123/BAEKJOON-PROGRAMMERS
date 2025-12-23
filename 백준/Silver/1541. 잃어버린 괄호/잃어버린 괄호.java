import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        int sum=Integer.MAX_VALUE;

        while(st.hasMoreTokens()){
            StringTokenizer st1 = new StringTokenizer(st.nextToken(),"+"); // +기준으로 나누기
            int temp=0;
            while(st1.hasMoreTokens()){
                temp += Integer.parseInt(st1.nextToken());
            }

            if(sum==Integer.MAX_VALUE){
                sum=temp;
            }else{
                sum-=temp;
            }


        }
        System.out.print(sum);
    }
}
