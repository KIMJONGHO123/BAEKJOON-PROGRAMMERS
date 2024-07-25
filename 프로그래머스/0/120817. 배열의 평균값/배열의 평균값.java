class Solution {
    public double solution(int[] numbers) {
        double total=0,avg=0;
        for(int i = 0; i<numbers.length; i++){
            total += numbers[i];
            avg = total/numbers.length;
            
        }
        return avg;
    }
}