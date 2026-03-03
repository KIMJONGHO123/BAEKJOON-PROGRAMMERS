import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String,Integer> hm = new HashMap();
        String answer="";
        
        // HashMap에 입력
        for(int i=0; i<participant.length; i++){
            hm.put(participant[i],hm.getOrDefault(participant[i],0)+1);
        }
        
        for(String st: completion){
            if(hm.containsKey(st)) hm.put(st,hm.get(st)-1);
        }
        
        for(String key:hm.keySet()){
            if(hm.get(key) ==1){
                answer = key;
                break;
            }
        }
        
        return answer;
    }
}