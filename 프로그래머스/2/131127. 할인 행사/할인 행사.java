import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        
        int able_day = 0;
        for(int q=0; q<=discount.length -10; q++){
            int check=0;
            Map<String, Integer> map = new HashMap<>();
            for(int i=0; i< want.length; i++){
                map.put(want[i], number[i]);
            }
            
            for(int j=q; j<q+10 ; j++){
                if(map.containsKey(discount[j])){
                    map.put(discount[j],map.get(discount[j])-1);
                }
            
            }
            
            for(int k=0; k< map.size(); k++){
                if(map.get(want[k]) !=0){
                    check=1;
                    break;
                }
            }
            if(check==0){
                able_day++;
            }
        }
        return able_day;
    }
}