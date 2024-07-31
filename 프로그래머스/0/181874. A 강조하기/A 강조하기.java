class Solution {
    public String solution(String myString) {
        String answer1="";
        String answer = myString.toLowerCase();
        
        for(int i =0; i < answer.length(); i++){
            if(answer.charAt(i) == 'a'){
                answer1 += answer.toUpperCase().charAt(i);
            }
            else{
                answer1+= answer.charAt(i);
            }
        }
        return answer1;
    }
}