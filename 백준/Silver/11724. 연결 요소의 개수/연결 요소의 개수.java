import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] array;
    static boolean visited[];

    public static void dfs(int now){
        //방문한 정점을 다시 방문하지 않도록 한다.
        // 무한 반복을 방지한다.
        if(visited[now] == true) return;
        else{
            visited[now] = true;
            for(int value : array[now]){
                dfs(value);
            }
        }
    }

    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        array = new ArrayList[n + 1];
        visited = new boolean[n+1];

        for(int i=1; i<=n; i++){
            array[i] = new ArrayList<Integer>();
        }

        for(int j=1; j<=m; j++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            array[a].add(b);
            array[b].add(a);

        }
        int count=0;

        for(int k=1; k<=n; k++){
            // 아직 DFS에 포함되지 않은 새로운 정점을 발견하면
            // 그 정점을 시작으로 DFS를 실행.
            if(!visited[k]){
                dfs(k);
                count++;
            }
        }
        System.out.print(count);

    }
}
