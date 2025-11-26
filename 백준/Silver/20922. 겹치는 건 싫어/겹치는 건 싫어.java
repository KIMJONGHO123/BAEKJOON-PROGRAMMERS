import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // index 번호 1부터 시작하기 위해서 크기 +1증가.
        int arr[] = new int[n+1];
        int count_arr[] = new int[200001];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int left=1;
        int right=1;
        int length=0;

        // right가 n보다 커지면 종료.
        while(right<=n){

            // k개 보다 더 넣으면 초과되기 때문에 바로 left를 당긴다.
            if(count_arr[arr[right]]==k){
                count_arr[arr[left]]--;
                left++;
            }else{
                count_arr[arr[right]]++;
                right++;

                // 현재 구간 길이 갱신.
                if((right-left)>length){
                    length=right-left;
                }
            }
        }
        System.out.println(length);
    }
}
