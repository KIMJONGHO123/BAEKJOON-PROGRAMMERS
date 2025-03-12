import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> li = new ArrayList<>();
        for(int i=0; i <numbers.length-1;i++ ){
            for(int j=i+1; j < numbers.length; j++){
                li.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer = li.stream().distinct().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}