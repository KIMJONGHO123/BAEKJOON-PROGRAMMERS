import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        
        String str = br.readLine();
        char array[] = str.toCharArray(); // char 배열로 변경.
        
        // 현재 부분 문자열의 문자 개수 저장 배열.
        int count[] = new int[4];
        
        for(int i =0; i<p; i++){
            char a = array[i];
            if(a == 'A') count[0]++;
            else if(a == 'C') count[1]++;
            else if(a== 'G') count[2]++;
            else if(a== 'T') count[3]++;
        }

        // 필요한 갯수 입력.
        int alpabet[] = new int[4];
        st = new StringTokenizer(br.readLine());
        for(int j=0; j<4; j++){
            alpabet[j] = Integer.parseInt(st.nextToken());
        }

        int totalCount=0;
        if(count[0]>= alpabet[0]
                && count[1]>= alpabet[1]
                && count[2] >= alpabet[2]
                && count[3] >= alpabet[3]){
            totalCount++;
        }

        // 슬라이딩 윈도우 핵심 로직
        // 나가는 부분과 새로 들어오는 부분만 확인하면 된다.
        for(int h=p; h<s; h++){
            char start = array[h-p]; // 왼쪽 빠지는 문자;
            char end = array[h]; // 오른쪽에 추가할 문자;

            // 빠지는 문자 개수 감소.
            if(start == 'A') count[0]--;
            else if(start == 'C') count[1]--;
            else if(start == 'G') count[2]--;
            else if(start == 'T') count[3]--;

            // 들어오는 문자 개수 증가.
            if(end== 'A') count[0]++;
            else if(end =='C') count[1]++;
            else if(end == 'G') count[2]++;
            else if(end == 'T') count[3]++;

            if(count[0]>= alpabet[0]
                    && count[1]>= alpabet[1]
                    && count[2] >= alpabet[2]
                    && count[3] >= alpabet[3]){
                totalCount++;
            }
        }
        System.out.print(totalCount);
    }
}
