import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(input.readLine()); //readLine()하면은 String을 반환한다. 따라서 정수형 형변환 해줘야함.
        int arr[] = new int[3];
        arr[0] = 1;
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(input.readLine()); //StringTokenizer 클래스는 문자열을 토큰이라는 여러개의 문자열로 잘라낸다.
            //input.readLine()로 String으로 받아온 것을 StringTokenizer 클래스로 나눈다(분리시킨다) 그 나눈것을 토큰이라고 한다.
            // "3 1"
            int x = Integer.parseInt(st.nextToken()); // 한 개의 토큰은 Stirng 형식이니까 Integer.parseInt()로 형 변환 시켜준다. "3" -> 3
            int y = Integer.parseInt(st.nextToken()); // 한 개의 토큰은 Stirng 형식이니까 Integer.parseInt()로 형 변환 시켜준다. "1" -> 1
            int temp;
            temp = arr[x-1];
            arr[x-1] = arr[y-1];
            arr[y-1] = temp;
        }
        for (int j = 0; j < 3; j++) {
            if (arr[j] ==1){
                System.out.println(j+1);
                break;
            }
        }

    }
}




