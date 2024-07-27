class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char array[] = myString.toCharArray(); // 문자열을 char형 배열로 전환.
        for(int i=0; i < array.length; i++){
            if(array[i]== 'A'){
                array[i]= 'B';
            }
            else{
                array[i] = 'A';
            }
        }
        String myString2 = new String(array);  // char형 배열을 다시 문자열로 전환.
        if(myString2.contains(pat)){
            answer+=1;
        }
        else{
            answer+=0;
        }
        
        return answer;
    }
}