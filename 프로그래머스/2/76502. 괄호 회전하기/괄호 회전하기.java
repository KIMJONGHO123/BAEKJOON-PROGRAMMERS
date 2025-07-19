import java.util.*;
class Solution {
    public int solution(String s) {
        
        int count =0;
        for(int j =0; j<s.length(); j++){
            boolean check = false;
            Stack<Character> stack = new Stack<>();
            if(j != 0){
                String a = s.substring(0,1);
                String aa = s.substring(1,s.length());
                s = aa.concat(a);
            }
            
            for(int i=0; i< s.length(); i++){
                check=false;
                if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                    stack.push(s.charAt(i));
                }else{
                    if(!stack.isEmpty()){
                        if(s.charAt(i) ==')'&& stack.peek()=='(' || s.charAt(i) =='}'&& stack.peek()=='{' || s.charAt(i) ==']'&& stack.peek()=='['){
                             stack.pop();
                             check=true;
                        }
                       
                    }else{
                        break;
                    }
                }
            }
            if(check == true){
                count++;
            }
            if(!stack.isEmpty()){
                return 0;
            }

        }
        return count;
    }
}