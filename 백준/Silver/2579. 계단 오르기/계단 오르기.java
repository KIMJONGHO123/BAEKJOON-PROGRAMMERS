import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    static int stairs;
    static int cum[];
    static int up(int stairs, int scores[]){
        
        if(stairs==1) return scores[1];
        if(stairs==2) return scores[1]+scores[2];

        // stairs가 3이상일때
        cum[1] = scores[1];
        cum[2] = scores[1]+scores[2];
        
        for(int j=3; j<=stairs;j++){
            cum[j] = Math.max(cum[j-2]+scores[j],cum[j-3]+scores[j-1]+scores[j]);
        }

        return cum[stairs];
    }
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        stairs = Integer.parseInt(br.readLine());
        int scores[] = new int[stairs+1];
        cum = new int[stairs+1];
        for(int i=1; i<scores.length; i++){
            scores[i] = Integer.parseInt(br.readLine());
        }

        System.out.print(up(stairs,scores));

    }

}