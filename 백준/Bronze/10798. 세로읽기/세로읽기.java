import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char array[][] = new char[5][15];

        for(int i=0; i<5; i++){
            String str = br.readLine();
            for(int j=0; j<str.length(); j++){
                array[i][j] = str.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int k=0; k<15; k++){
            for(int o=0; o<5;o++){
                if(array[o][k]>='A' && array[o][k]<='Z'
                    || array[o][k] >='a'&& array[o][k]<='z'
                    || array[o][k]>='0' && array[o][k]<='9'
                ){
                    sb.append(array[o][k]);
                }else{
                    continue;
                }
            }
        }
        System.out.print(sb);
    }
}
