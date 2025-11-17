import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int array[] = new int[n];
        for(int i=0; i< n; i++){
            array[i] = Integer.parseInt(br.readLine());
            // 4 3 6 8 7 5 2 1
        }

        Stack<Number> stack = new Stack<>();
        int num=1;
        StringBuffer bf = new StringBuffer();
        for(int j=0; j<n; j++){
            int one = array[j];
            if(one>=num){
                while(one>=num){
                    stack.push(num);
                    num++;
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");

            }
            else if(one <num){
                if(stack.isEmpty()){
                    break;
                }
                if((int)stack.peek()>one){
                    bf.setLength(0);
                    bf.append("NO");
                    break;
                }else{
                    if(stack.isEmpty()){
                        break;
                    }
                    stack.pop();
                    bf.append("-\n");
                }
            }

        }
        System.out.println(bf);
    }
}
