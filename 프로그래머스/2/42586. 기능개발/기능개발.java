import java.util.*;
import java.lang.Math;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue <Integer> que = new ArrayDeque<>();
        for(int i=0; i< progresses.length; i++){
            que.add((int)Math.ceil((100.0-progresses[i])/speeds[i]));
        }
        int first = que.poll();
        int count=1;
        List<Integer> li = new ArrayList<>();
        while(!que.isEmpty()){
             if(first >= que.peek()){
                count++;
                que.poll();
             }else{
                li.add(count);
                count=1;
                first = que.poll();
            }
        }
        li.add(count);
        return li.stream().mapToInt(i->i).toArray(); // 3,4,2,3
    }
}