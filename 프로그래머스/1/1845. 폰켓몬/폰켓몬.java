import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        //내가 가져갈 수 있는 종류
        int kind = nums.length/2;
        
        // HashMap에 값 입력, 연구실에 있는 폰켄몬 종류
        for(int key:nums){
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
        
        // 종류가 아무리 많아도 kind보다 많이 가져갈 수 없고
        // 종류가 적으면 그 종류만큼만 가져갈 수 있다.
        return Math.min(hm.size(),kind);
        
        
    }
}