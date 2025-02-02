import java.util.*;
class Solution {
    public long solution(long n) {
        
        String s = Long.toString(n);
        int arr[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i)-'0';
        }
        Arrays.sort(arr); // 오름차순으로 정렬
        StringBuilder ss=  new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            ss.append(arr[i]);
        }
       return Long.parseLong(ss.reverse().toString());
    }
}