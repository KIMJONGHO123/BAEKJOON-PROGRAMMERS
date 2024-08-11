import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int[] array = new int[numbers.length-1];
        int total=0;
        int index=0;
        Arrays.sort(numbers);
        for(int i =0; i < numbers.length-1; i++){
            total = numbers[i] * numbers[i+1];
            array[index++]= total;
        }
        
        Arrays.sort(array);
        return array[array.length-1];
    }
}