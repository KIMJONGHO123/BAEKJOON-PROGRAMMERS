import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i< s.length(); i++){
            char cs = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(cs);
            }else if(cs == stack.peek()){
                stack.pop();
            }else{
                stack.push(cs);
            }
        }
        if(stack.isEmpty()){
            answer++;
        }
        return answer;
    }
}