class Solution {
    public int solution(int[] array) {
        for(int i =0;i<array.length -1;i++){ // 정렬된 마지막 요소는 또다시 비교하지 않는다.
            for(int j =0; j<array.length -1;j++){
                if(array[j]>array[j+1]){
                    int temp;
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]= temp;
                    
                }
            }
        }
        
        int answer = array[array.length/2];
        return answer;
    }
}