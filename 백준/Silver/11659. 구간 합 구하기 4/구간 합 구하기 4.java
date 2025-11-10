import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int array[] = new int[n];
        st = new StringTokenizer(bf.readLine()); // 배열 입력은 한줄만 읽고 밑에서 토큰을 하나씩 꺼내서 채워야 한다.
        for(int i=0; i<n; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }


        int s[] = new int[n];
        s[0] = array[0];
        for(int j=1; j<n; j++){
            int sum = s[j-1]+array[j];
            s[j] = sum;
        }

        int sum=0;
        for(int k = 0; k<m; k++){
            st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            if(i == 1){
                sum = s[j-1];
                System.out.println(sum);
            }else{
                sum = s[j-1] - s[i-2];
                System.out.println(sum);
            }
        }

    }

}
