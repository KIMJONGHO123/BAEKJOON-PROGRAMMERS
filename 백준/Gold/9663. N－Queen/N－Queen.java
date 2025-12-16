import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean col[];
    public static boolean dia1[]; // 왼쪽 위->오른쪽 아래, 오른쪽 아래->왼쪽 위
    public static boolean dia2[]; // 오른쪽 위->왼쪽 아래, 왼쪽 아래->오른쪽 위
    public static int n;
    public static int count;
    public static void nQueen(int row){
        //N행까지 다 놓았으면 경우의 수 +1 하고 함수 끝
        if(row==n){
            count++;
            return;
        }

        //row행에 놓을 열 하나씩 시도
        for(int i=0; i<n; i++){
            int d1 = row-i+(n-1); //배열에 - 는 못들어가기 때문에 (n-1)로 보정 \
            int d2 = row+i; // /

            // 같은 열 또는 대각선에 퀸이 있으면 못 놓는다.
            if(col[i]) continue;
            if(dia1[d1]) continue;
            if(dia2[d2]) continue;

            // 같은 열 또는 대각선에 퀸이 없는 경우
            col[i] = true;
            dia1[d1] = true;
            dia2[d2] = true;

            // 다음행을 넘기기
            nQueen(row+1);

            // 되돌리기(백트래킹)
            col[i] = false;
            dia1[d1] = false;
            dia2[d2] = false;
}
    }
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        col = new boolean[n];
        dia1 = new boolean[2*n-1];
        dia2 = new boolean[2*n-1];

        nQueen(0); // 0번째 행렬부터 시작
        System.out.print(count);
    }
}
