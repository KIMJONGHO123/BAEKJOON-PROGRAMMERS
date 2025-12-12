import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    public static int m;
    public static int arr[];
    public static boolean visited[];
    public static int selected[];
    public static StringBuilder sb = new StringBuilder();
    public static void dfs(int depth){
        if(depth ==m){
            for(int j=0;j<m;j++){
                sb.append(selected[j]).append(" ");
            }
            sb.append("\n");
            return;
        }

        int usedNum = -999999999;
        for(int k=0; k<n; k++){
            if(visited[k] ==true) continue;
            if(usedNum== arr[k]) continue;
            else{
                visited[k] = true;
                selected[depth] = arr[k];
                usedNum = arr[k];
                dfs(depth+1);
                visited[k] = false;
            }
        }
    }

    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }

        visited = new boolean[n];
        selected = new int[m];

        dfs(0);

        System.out.print(sb);
    }
}
