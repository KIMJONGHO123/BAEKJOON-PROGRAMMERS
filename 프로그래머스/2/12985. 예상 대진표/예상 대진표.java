class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        for(int i=0; a != b ; i++){
            a = (a+1)/2;
            b=(b+1)/2;
            answer++;
        }
        return answer;
    }
}