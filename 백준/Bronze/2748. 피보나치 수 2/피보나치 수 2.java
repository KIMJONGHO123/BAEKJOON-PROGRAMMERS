import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Long arr[];
    public static Long fabo(int n){
        if(arr[n] != -1L){
            return arr[n];
        }
        return arr[n] = fabo(n-1)+fabo(n-2);
    }
    public static void main(String[]args)throws IOException {
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sb.readLine());

        arr = new Long[100];
        for(int i = 0; i<arr.length; i++){
            arr[i] = -1L;
        }

        arr[0] = 0L; // 재귀함수를 끝낼 종료조건. 이거 없으면 재귀호출 무한히 내려간다.
        arr[1] = 1L; // 재귀함수를 끝낼 종료조건. 이거 없으면 재귀호출 무한히 내려간다.
        System.out.print(fabo(n));
    }
}
