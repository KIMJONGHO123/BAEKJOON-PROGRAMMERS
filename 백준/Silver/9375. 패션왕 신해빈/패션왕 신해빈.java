import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            HashMap<String,Integer> hm = new HashMap<>();
            for(int j=0; j<n;j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String key = st.nextToken();
                if(hm.containsKey(key)){
                    hm.replace(key,hm.get(key)+1);
                }else{
                    hm.put(key,2);
                }
            }

            Collection<Integer>values=hm.values();
            int cal=1;
            for (Integer value:values){
                cal*=value;
            }
            System.out.println(cal-1);


        }

    }
}
