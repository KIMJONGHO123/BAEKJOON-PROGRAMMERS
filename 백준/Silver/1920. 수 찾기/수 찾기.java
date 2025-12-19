import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //오름차순 정렬
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        int arr1[] = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int j=0; j<m;j++){
            arr1[j] = Integer.parseInt(st.nextToken());
        }

        boolean find[] = new boolean[m];
        StringBuilder sb = new StringBuilder();
        for(int k=0;k<m;k++){
            int left=0;
            int right=arr.length-1;
            int num = arr1[k];

            while(left<=right){
                int mid = (left+right)/2;
                if(num==arr[mid]){
                    sb.append(1).append("\n");
                    find[k] = true;
                    break;
                }else if(num<arr[mid]){ // num=1  mid =3
                    right = mid-1;
                }else if(num>arr[mid]){ // num=7 mid=3
                    left = mid+1;
                }
            }
            if(find[k] == false){
                sb.append(0).append("\n");
            }
        }
        System.out.print(sb);
    }
}
