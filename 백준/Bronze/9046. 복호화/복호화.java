import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int array[];
    static void check(StringTokenizer st){
        if(!st.hasMoreTokens())return;
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            for(int i=0; i<str.length();i++){
                char ch = str.charAt(i);
                if(ch>='a' && ch<='z'){
                    int index= ch-'a'; // 112-97 => 25
                    array[index] ++;
                }
                

            }
        }
    }
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());

        for(int j=0; j<t; j++){
            array = new int[27];

            st = new StringTokenizer(br.readLine());
            check(st);

            int max=0;
            int max_index=0;
            int max_same=0;
            for(int i=0; i<array.length; i++){
                if(array[i] == 0) continue;
                if(array[i]==max) max_same=1;
                else if(array[i]>max){
                    max = array[i];
                    max_index = i;
                    max_same=0;
                }
            }

            if(max_same==0){
                char alpabet = (char)('a'+max_index);
                System.out.println(alpabet);
            }else{
                System.out.println("?");
            }

        }

    }
}
