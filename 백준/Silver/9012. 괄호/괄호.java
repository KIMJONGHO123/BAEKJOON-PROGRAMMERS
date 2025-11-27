import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            Stack<Character> stack = new Stack<>();
            String st = br.readLine();
            for(int j=0; j<st.length(); j++){
                char ch = st.charAt(j);
                if(ch=='('){
                    stack.add(ch);
                }else{
                    if(stack.isEmpty()) {
                        stack.add(')'); // 틀렸다는 표시.
                        break;
                    }
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }

    }
}
