import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map <String,Integer> map = new HashMap<>(); // participant 배열의 횟수
        for(int i=0; i<participant.length; i++){
            map.put(participant[i], map.getOrDefault(participant[i],0)+1); // 
        }
        for(int j=0;j< completion.length;j++){
            map.put(completion[j],map.get(completion[j])-1); //완주한 선수들의 value를 -1 해준다.
        }
        List<String> li = new ArrayList<>();  // 완주하지 못한 선수를 넣을 리스트
        
        for(int i=0; i<participant.length; i++){
            if(map.get(participant[i]) !=0 ){ // value 값 중에서 0 이 아니면
                li.add(participant[i]);       // li에 key를 집어넣는다.
            }
        }
        String s = li.get(0);
        return s;
        
    }
}

// import java.util.*;
// class Solution {
//     public String solution(String[] participant, String[] completion) {
//         Map <String,Integer> map = new HashMap<>(); // participant 배열의 횟수
//         for(int i=0; i<participant.length; i++){
//             map.put(participant[i], map.getOrDefault(participant[i],0)+1);
//         }
//         for(int j=0;j< completion.length;j++){
//             map.put(completion[j],map.get(completion[j])-1); // 
//         }

        
//         for(int i=0; i<participant.length; i++){
//             if(map.get(participant[i]) !=0 ){ // value 값 중에서 0 이 아니면
//                 return participant[i];
//             }
//         }


//         return "";
//     }
// }