import java.util.*;
class Solution {
    public int solution(String s) {
        
        int count =0;
        for(int i=0; i<s.length();i++){
            Stack <String> st = new Stack<>();
            boolean answer = true;
            String newS = s.substring(i)+s.substring(0,i);
            for(int j=0; j < newS.length(); j++){
                if(newS.charAt(j) == '['){
                    st.push("[");
                }else if(newS.charAt(j) == '{'){
                    st.push("{");
                }else if(newS.charAt(j) == '('){
                    st.push("(");
                }
                
                else if(newS.charAt(j) == ']'){
                    if(!st.isEmpty() && st.peek().equals("[")){
                        st.pop();
                    }else{
                        answer = false;
                        break;
                    }
                }else if(newS.charAt(j) == '}'){
                    if(!st.isEmpty() && st.peek().equals("{")){
                        st.pop();
                    }else{
                        answer = false;
                        break;
                    }
                }else if(newS.charAt(j) == ')'){
                    if(!st.isEmpty() && st.peek().equals("(")){
                        st.pop();
                    }else{
                        answer = false;
                        break;
                    }
                }
                
            }
            if(answer && st.isEmpty()){
                count++;
            }
        }
        
        return count;
    }
}