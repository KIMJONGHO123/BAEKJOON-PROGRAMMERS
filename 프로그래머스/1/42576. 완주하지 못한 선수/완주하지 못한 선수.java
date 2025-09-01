import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String s ="";
       HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0; i<participant.length; i++){
            hm.put(participant[i],hm.getOrDefault(participant[i],0)+1);
            // participant안에 있는 원소의 갯수 구하기
        }
        for(String n: completion){
            hm.put(n,hm.get(n)-1); //완주한 사람 -1하기
        }
        for(String q : participant){
            if(hm.get(q)!=0){
                s = q;
                break;
            }
        }
        return s;
    }
}