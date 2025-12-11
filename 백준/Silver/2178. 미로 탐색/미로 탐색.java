import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int arr[][] = new int [n][m];

        // 이차원 배열 입력
        for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j=0; j<m; j++){
                arr[i][j] = str.charAt(j)-'0';
            }
        }

        // 방문 여부 배열(미로 자체가 2차원 배열이기 때문에 1차원 배열로 저장하면 더 복잡하다.)
        boolean visit[][]  = new boolean[n][m];
        // 거리 저장 배열
        int dist[][] = new int[n][m];

        // BFS용 큐(x,y 위치 2개를 동시에 저장해야하기 때문에 int[]사용)
        Queue<int[]> queue = new LinkedList<>();

        // 시작 위치(0,0)으로 설정
        visit[0][0] = true;
        dist[0][0] = 1; // 시작 위치도 포함해서 1부터 시작
        queue.add(new int[]{0,0});

        // 방향 설정(2차원 배열의 행과 열 기준)
        int index_x[] = {-1,1,0,0};
        int index_y[] = {0,0,-1,1};

        //BFS 시작
        while(!queue.isEmpty()){
            int now[] = queue.poll();
            int x = now[0]; //0
            int y = now[1]; //0

            // 네 방향으로 이동 시도
            for(int k=0; k<4; k++){
                int dx = x+index_x[k];
                int dy = y+index_y[k];

                // index가 0부터 시작하기 때문에 0<=dx<=n-1
                if(dx<0 || dy<0 || dx>=n|| dy>=m) continue;
                // 0은 벽이니까 이동 x
                if(arr[dx][dy]==0) continue;
                // 방문했는지 확인
                if(visit[dx][dy]) continue;

                // 방문처리 + 거리 갱신 + 큐에 넣기
                visit[dx][dy] = true;
                dist[dx][dy] = dist[x][y]+1;
                queue.add(new int[]{dx,dy});

            }
        }

        // 도착점 까지의 최소 칸 수 출력
        System.out.print(dist[n-1][m-1]);
    }
}
