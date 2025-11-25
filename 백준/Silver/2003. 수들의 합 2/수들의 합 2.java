import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int arr[] = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 투 포인터 사용
        int left = 0;
        int right= 0;
        int sum= 0;
        int count=0;

        while(true){

            if(sum==m){
                count++;
                sum -= arr[left];
                left++;
            }else if(sum>m){
                sum -= arr[left]; // sum이 m보다 크면 먼저 빼줘야한다. 그 이후에 left++
                left++;
            }else if(sum<m){
                if(right==n){ // 여기서만 right의 범위를 늘리기 때문에 배열 범위를 벗어나는지 아닌지 확인하기 위한 조건
                    break; // left를 줄이면서 추가로 sum==m 인 구간을 더 찾을 수 있는데 right==n으로 끊어버리면 정답을 놓칠 수 있다.
                }
                sum += arr[right];// sum이 m보다 작으면 먼저 더해줘야한다. 그 이후에 right++
                right++;
            }


        }
        System.out.println(count);
    }
}
