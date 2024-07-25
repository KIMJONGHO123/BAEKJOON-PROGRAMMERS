class Solution {
    public int[] solution(int money) {
        int coffee = 5500;
        int count = money / coffee;
        int rest = money % coffee;
        int[] answer = {count,rest};
        return answer;
    }
}