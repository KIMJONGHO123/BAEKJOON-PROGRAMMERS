import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int arr[] = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max=0;
        // 모든 조합이 다 검사된다 -> 의미 없는 반복을 하게 된다.
//        for(int i=0; i<n; i++){
//            for(int k=i+1;k<n;k++){
//                for(int j=k+1;j<n;j++){
//                    int sum = arr[i]+arr[k]+arr[j];
//
//                    if(sum<=m) {
//                        if (max<=sum){
//                            max=sum;
//                        }
//                    }
//
//                }
//            }
//        }
        for(int i=0; i<n-2; i++){
            for(int k=i+1;k<n-1;k++){
                for(int j=k+1;j<n;j++){
                    int sum = arr[i]+arr[k]+arr[j];

                    if(sum<=m) {
                        if (max<=sum){
                            max=sum;
                        }
                    }

                }
            }
        }
        System.out.print(max);

    }
}
