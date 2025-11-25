import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int arr[][] = new int[n+1][n+1];
        int prefix_sum[][] = new int[n+1][n+1];

        // 이차원 배열 입력
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // prefix 배열 만들기
        for(int u=1; u<=n; u++){
            for(int k=1; k<=n; k++){
                prefix_sum[u][k] = prefix_sum[u-1][k]+prefix_sum[u][k-1]-prefix_sum[u-1][k-1]+arr[u][k];
            }
        }

        for(int h=0; h<m; h++){
            int sum=0;
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            sum = prefix_sum[x2][y2]-prefix_sum[x1-1][y2]-prefix_sum[x2][y1-1]+prefix_sum[x1-1][y1-1];
            System.out.println(sum);
        }
    }
}
