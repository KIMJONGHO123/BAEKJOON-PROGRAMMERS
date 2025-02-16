import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {


        List <String> arr = new ArrayList<>();
        for(int i=0; i<strings.length; i++){
            arr.add(String.valueOf(strings[i].charAt(n))+strings[i]);
        }
        Collections.sort(arr);
        String answer[] = new String[arr.size()];
        for(int j=0; j<strings.length; j++){
            answer[j] = arr.get(j).substring(1,arr.get(j).length());
        }
        return answer;
    }
}