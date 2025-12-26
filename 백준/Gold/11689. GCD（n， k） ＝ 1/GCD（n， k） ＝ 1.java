import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long n = Long.parseLong(br.readLine());

        Long result=n;

        for(Long i = 2L; i*i<=n; i++){
            if(n%i==0){ // i가 소인수라면
                result = result/i*(i-1); // (1 - 1/i) 적용
                while(n%i==0){ // i로 계속 나눔
                    n /= i;
                }
            }

        }

        // 마지막에 소인수가 남아있는 경우 예) n이 14인 경우 마지막에 7이 남음
        if(n>1){
            result = result/n*(n-1);
        }
        System.out.print(result);
    }
}
