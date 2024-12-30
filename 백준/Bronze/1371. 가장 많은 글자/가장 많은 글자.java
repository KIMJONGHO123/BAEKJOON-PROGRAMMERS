import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[] HowMany = new int[26];
        for (int i = 0; i < 26; i++) {
            HowMany[i] = 0;
        }
        String s;
        while((s = input.readLine()) !=null){
            for (int j=0; j < s.length(); j++){
                char c = s.charAt(j);
                if (c >= 97 && c <= 122){
                    HowMany[c-97]++;
                }
            }

        }

        int max = 0;
        for (int p = 0; p < 26; p++) {
            if (max <HowMany[p]){
                max = HowMany[p];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < 26; k++) {
            if (max ==  HowMany[k]){
                sb.append((char)(k+'a'));
            }
        }
        System.out.println(sb.toString());

    }
}




