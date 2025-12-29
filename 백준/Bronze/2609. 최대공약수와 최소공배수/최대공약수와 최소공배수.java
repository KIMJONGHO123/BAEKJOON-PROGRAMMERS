import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int gcpNum = 0;
    static int lcmNum=0;
    public static void gcp(int n, int m){
        if(m==0){
            gcpNum = n;
            sb.append(gcpNum).append("\n");
            return;
        }
        gcp(m,n%m);
    }
    public static void lcm(int n, int m){
        lcmNum = (n*m)/gcpNum;
        sb.append(lcmNum).append("\n");
    }
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        gcp(n,m); //최대공약수
        lcm(n,m); //최소공배수
        System.out.print(sb);
    }
}
