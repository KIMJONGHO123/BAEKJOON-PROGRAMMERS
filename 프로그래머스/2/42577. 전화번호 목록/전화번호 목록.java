import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        
        // 정렬하면 접두어는 바로 다음에 나온다. i와 i+1만 비교하면 된다. [A,B,AB] 이거 sort하면은 A,AB,B로 정렬된다. 그니까 i랑         //i+1만 비교하면 된다.
        Arrays.sort(phone_book);
        boolean answer;
        for(int i=0; i<phone_book.length-1; i++){
             answer= phone_book[i+1].startsWith(phone_book[i]);
            if(answer) return false;
        }
        return true;
    }
}