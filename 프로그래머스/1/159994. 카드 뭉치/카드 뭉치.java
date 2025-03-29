import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> que1 = new ArrayDeque<>();
        Queue<String> que2 = new ArrayDeque<>();
        List<String>li = new ArrayList<>();
        
        for(int i=0; i < cards1.length; i++){
            que1.add(cards1[i]);
        }
        for(int i=0; i < cards2.length; i++){
            que2.add(cards2[i]);
        }
        String result="Yes";
        for(int i=0; i < goal.length; i++){
            String check = goal[i];
            if(goal[i].equals(que1.peek()) && (!que1.isEmpty()))  {
                li.add(que1.poll());
            }
            else if(goal[i].equals(que2.peek()) && (!que2.isEmpty())){
                li.add(que2.poll());
            }else{
                result = "No";
                break;
            }
        }

        
        return result;
    }
}