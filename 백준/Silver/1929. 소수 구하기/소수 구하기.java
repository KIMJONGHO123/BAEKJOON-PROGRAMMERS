import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int arr[] = new int[n-m+1];
        int index=0;
        for(int i=m; i<=n; i++){
            if(i==1)continue;
            arr[index++] = i;
        }

        double two = Math.sqrt(n); // 4.0

        int intTwo = (int) two; // 4

        // 약수 검사는 무조건 2부터 시작해서 루트n까지면 충분하다.
        for(int j=2; j<=intTwo; j++){
            if(j==1) continue;

            int index1 = 0;
            while(index1<=n-m){
                if(arr[index1] == j){
                    index1++;
                    continue;
                }
                if(arr[index1] %j == 0){
                    arr[index1] = -1;
                }
                index1++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int k=0; k<arr.length;k++){
            if(arr[k] != -1){
                if(arr[k]==0)continue;
                sb.append(arr[k]).append("\n");
            }
        }
        System.out.print(sb);
    }
}
