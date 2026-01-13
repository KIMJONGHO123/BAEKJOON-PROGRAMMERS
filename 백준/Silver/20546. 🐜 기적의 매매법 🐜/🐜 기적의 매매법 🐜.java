import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int junhyun(int cash, int array[]){
        int jusikNum=0;
        for(int i=0; i<14; i++){
            if(cash>=array[i]){
                jusikNum += cash/array[i];
                cash%=array[i];
            }
        }
        return cash+jusikNum*array[13];
    }
    static int sungmin(int cash, int array[]){
        int jusikNum=0;
        int saleCheck=0;
        int buyCheck=0;
        // 3일 연속 상승 -> 전량 매도하기
        for(int i=0; i<13; i++){
            if(array[i]<array[i+1]){
                saleCheck++;
                buyCheck=0;
            }else if(array[i]>array[i+1]){
                buyCheck++;
                saleCheck=0;
            }else{
                saleCheck=0;
                buyCheck=0;
            }
            if(saleCheck >=3){
                cash+= jusikNum*array[i+1];
                jusikNum=0;
            }
            if(buyCheck >=3){
                jusikNum+= cash/array[i+1];
                cash%=array[i+1];
            }
        }

        return cash+jusikNum*array[13];

    }
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cash = Integer.parseInt(br.readLine());

        int array[] = new int[14];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<14; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        int junhyunCash = junhyun(cash,array);
        int sungminCash = sungmin(cash,array);

        if(junhyunCash>sungminCash) System.out.print("BNP");
        else if(sungminCash>junhyunCash) System.out.print("TIMING");
        else System.out.print("SAMESAME");
    }
}
