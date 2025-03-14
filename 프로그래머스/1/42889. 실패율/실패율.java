import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        
        Map <Integer,Double>map = new HashMap<>();
        
        for(int i=1; i<=N; i++){
            double falePerson=0;
            double passPerson=0;
            int count=0;
            for(int j=0; j<stages.length; j++){
                if(i == stages[j]){
                    falePerson++;  // 해당 스테이지를 실패한 사람 수
                }
            }
 
            for(int k=0; k<stages.length; k++){
                if(i <=stages[k]){
                    passPerson++; // 해당 스테이지를 통과한 사람 수
                }
            }
            
            if(passPerson!=0){
                double falePercent = falePerson/passPerson; // 실패율
                System.out.println(falePercent);
                map.put(i,falePercent); // map에 key(스테이지 번호) , value(실패율)
            }else if(passPerson == 0){
                map.put(i,0.0);
            }
        }
        
        List<Integer> LiToMap = new ArrayList<>(map.keySet()); // map을 내림차순으로 정렬하기 위한 List 선언
        
        LiToMap.sort((e1,e2) -> map.get(e2).compareTo(map.get(e1))); // map을 내림차순해서 LiToMap으로 이동.
        int[] answer = LiToMap.stream().mapToInt(i->i).toArray();
        return answer;
    }
}