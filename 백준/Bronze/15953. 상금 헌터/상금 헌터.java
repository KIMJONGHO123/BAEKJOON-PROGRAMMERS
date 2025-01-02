import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        int arrSeven[] = {500,300,300,200,200,200,50,50,50,50,30,30,30,30,30,10,10,10,10,10,10};
        int arrEight[] = {512,256,256,128,128,128,128,64,64,64,64,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32};
        for(int i=0;i<t;i++){
            StringTokenizer st = new StringTokenizer(input.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int SevenSum =0;
            if (a>=1 && a<=21){

                SevenSum +=arrSeven[a-1];
            }
            else{
                a=0;
            }
            int EightSum=0;
            if (b>=1 && b<=31){
                EightSum+=arrEight[b-1];
            }
            else{
                b=0;
            }

            System.out.println((SevenSum+EightSum)*10000);



        }
    }
}
