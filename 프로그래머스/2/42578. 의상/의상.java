import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        
        HashMap<String,Integer> hm = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++){
            for(int j=1; j<clothes[i].length; j++){
                // 옷의 종류마다 몇개의 옷이 있는지
                hm.put(clothes[i][j], hm.getOrDefault(clothes[i][j],0)+1);
            }
        }
        
        int cal=1;
        
        for(int value: hm.values()){
            cal *= (value+1);
        }
        
        return cal-1;
    }
}