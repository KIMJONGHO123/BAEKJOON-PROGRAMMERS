import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int mari = (nums.length)/2;
        for(int i =0; i<nums.length; i++){
            hs.add(nums[i]);
        }
        int count=0;
        for(int num : hs){
            count++;
            if(count == mari){
                break;
            }
        }
        return count;
    }
}