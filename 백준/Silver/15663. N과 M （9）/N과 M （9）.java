import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    public static int m;
    public static int nums[];
    public static boolean visit[];
    public static int select[];
    public static StringBuilder sb = new StringBuilder();

    public static void dfs(int depth){
        // m개를 다 골랐으면 출력.
        if(depth ==m){
            for(int j=0; j<m; j++){
                sb.append(select[j]).append(" ");
            }
            sb.append("\n");
            return;
        }

        // 중복 수열 막기 위한 변수.
        int lastUsed = -999999999;

        for(int k=0; k<n; k++){
            //이미 사용한 인덱스면 넘어가기
            if(visit[k]) continue;
            // 중복되는 수열 방지 코드
            if(lastUsed == nums[k]) continue;
            //
            else{
                // 방문 처리
                visit[k] =true;
                // 값을 선택
                select[depth] = nums[k];
                // 중복순열 막기 위한 변수 재할당.
                lastUsed = nums[k];
                // select 배열의 다음 자리 선택하기 위한 재귀 함수.
                dfs(depth+1);
                // 백트래킹(원상복구)
                visit[k] = false;
            }
        }

    }
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        nums= new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // 오름차순으로 정렬, 중복 처리 쉽게 하기 위해서
        Arrays.sort(nums); // 2 4 4

        visit = new boolean[n];
        select = new int[m];

        dfs(0);

        System.out.print(sb);

    }
}
