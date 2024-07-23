class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int bunmo = denom1 * denom2;
        int bunja = (numer1 * denom2) + (numer2 * denom1);
        int max = 0;
        for(int i = 1; i<=bunmo && i<=bunja;i++){
            if(bunmo %i==0 && bunja %i ==0){
                max=i;
            }
        }
        int denom = bunmo/max;
        int numer = bunja / max;

       int[] answer = {numer,denom};
        
        return answer;
    }
}