import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<>(){
            @Override
            public int compare(Integer o1, Integer o2){
                if(Math.abs(o1) == Math.abs(o2)){ // 절대값이 가장 작은 값이 여러개일때, 가장 작은 수를 출력
                    return o1-o2;
                }else{ // 절대값이 가장 작은 값을 출력.
                    return Math.abs(o1)-Math.abs(o2);
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            if(num!=0) pq.add(num);
            else if(num==0){
                if(!pq.isEmpty()) sb.append(pq.poll()).append("\n");
                else sb.append("0\n");

            }
        }
        System.out.print(sb);
    }

}

