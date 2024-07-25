class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int arr1_total=0;
        int arr2_total=0;
        int answer = 0;
        if(arr1.length == arr2.length){
            for(int i =0; i < arr1.length; i++){
                arr1_total += arr1[i];
            }
            for(int i =0; i < arr1.length; i++){
                arr2_total += arr2[i];
            }
            if(arr1_total == arr2_total){
                answer = 0;
            }
            else{
                if(arr1_total > arr2_total){
                    answer = 1;
                }
                else{
                    answer = -1;
                }
            }
        }
        else{
            if(arr1.length > arr2.length){
                answer = 1;
            }
            else{
                answer = -1;
            }
        }
        
        return answer;
    }
}