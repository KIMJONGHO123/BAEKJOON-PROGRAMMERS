import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Integer> array[];
    static boolean dfsVisited[];
    static Queue queue;
    static boolean bfsVisited[];
    static StringBuilder sb = new StringBuilder();
    static StringBuilder sb2 = new StringBuilder();
    static void dfs(int v){
        if(dfsVisited[v] == true) return;

        sb.append(v).append(" ");
        dfsVisited[v] = true;

        for(int i=0; i<array[v].size(); i++){
            dfs(array[v].get(i));
        }
    }
    static void bfs(int v) {
        queue.add(v);
        bfsVisited[v] = true;
        while(!queue.isEmpty()){
            int num = (int)queue.poll();
            sb2.append(num).append(" ");
            for(int r = 0; r<array[num].size(); r++){

                int next = array[num].get(r);
                if(!bfsVisited[next]){
                    bfsVisited[next] = true;
                    queue.add(next);
                }
            }

        }
    }
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        array = new ArrayList[n+1]; // 인접리스트배열
        dfsVisited = new boolean[n+1]; // 방문 배열

        for(int i=1; i<=n; i++){
            array[i] = new ArrayList<>();
        }
        for(int j=1; j<=m;j++){
            st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());

            // 양방향 입력
            array[one].add(two);
            array[two].add(one);
        }

        // 정점이 여러개인 경우 정점 번호가 작은 것 부터 먼저 방문
        for(int e=1; e<=n; e++){
            //배열안에 있는 리스트를 오름차순 정렬
            array[e].sort(null);
        }
      
        dfs(v);

        queue = new LinkedList<>();
        bfsVisited = new boolean[n+1];

        bfs(v);

        System.out.println(sb);
        System.out.println(sb2);
    }
}
