import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack <String> st = new Stack<>();
        int count=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == '('){
                st.push("(");
            } else if(s.charAt(i) == ')'){
                if(st.isEmpty()){
                    return false;
                }else{
                    st.pop();
                }
            }
        }
        if(st.isEmpty()){
            return answer;
        }else{
            return false;
        }
    }
}