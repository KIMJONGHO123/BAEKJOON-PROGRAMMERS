import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int array[] = new int[n];
        for(int i=0; i<n; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        // 고유한 번호들이니까 오름차순으로 정렬
        Arrays.sort(array);

        int left=0;
        int right=array.length-1;
        int count=0;
        int sum=array[left]+array[right];
        while(true){
            if(left>=right){
                break;
            }
            if(sum==m) {
                count++;
                left++;
                right--;

                sum=array[left]+array[right];
            }
            if(sum>m){
                right--;
                sum=array[left]+array[right];
            }else if(sum<m){
                left++;
                sum=array[left]+array[right];
            }
        }

        System.out.print(count);

    }
}
