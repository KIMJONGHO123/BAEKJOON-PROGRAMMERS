import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    public static int m;
    public static int selected[];
    public static StringBuilder sb = new StringBuilder();

    // depth : 지금 채우는 칸(0번째 칸, 1번째 칸) , start : 이번 칸에서 시작 가능한 최소 숫자
    public static void backTracking(int depth,int start){
        if(depth==m) {
            for(int k=0;k<m; k++){
                sb.append(selected[k]).append(" ");
            }
            sb.append("\n");
            return;
        }else{
            for(int j=start;j<=n;j++){
                selected[depth] = j;
                backTracking(depth+1,j+1);
            }

        }
    }
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        selected = new int[m];
        backTracking(0,1);
        System.out.print(sb);
    }
}
