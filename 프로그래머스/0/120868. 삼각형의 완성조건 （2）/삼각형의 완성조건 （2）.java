import java.util.*;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int max = sides[1];
        int min = sides[0];
        int answer = max+min-(max-min)-1;
        return answer;
    }
}