import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int arr[] = new int[str.length()];

        // 문자 -> 숫자로 변환
        for(int i=0; i<str.length(); i++){
            // -'0' 해줘야지 진짜 숫자로 바뀜.
            arr[i] = str.charAt(i)-'0';
        }

        // 선택정렬(내림차순)
        for(int j=0; j<str.length()-1; j++){
            int maxindex= j;
            for(int k=j+1; k<str.length(); k++){
                if(arr[k]>arr[maxindex]){
                    maxindex = k;
                }
            }

            // i 번째 값과 가장 큰 값의 위치 교환
            int temp = arr[j];
            arr[j] = arr[maxindex];
            arr[maxindex] = temp;
        }

        for(int o=0; o<str.length(); o++){
            System.out.print(arr[o]);
        }
    }
}
