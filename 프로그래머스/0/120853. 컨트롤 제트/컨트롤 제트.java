class Solution {
    public int solution(String s) {
        int answer = 0;
        String p[] = s.split(" ");
        for(int i =0; i <p.length; i++ ){
            
            
            if(p[i].equals("Z")){
                answer-=Integer.parseInt(p[i-1]);
            }
            else{
                answer+=Integer.parseInt(p[i]);
            }
        }
        return answer;
    }
}