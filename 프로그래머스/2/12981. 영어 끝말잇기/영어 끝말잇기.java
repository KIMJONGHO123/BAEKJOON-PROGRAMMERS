import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int zero[] = {0,0};
        HashMap<String,Integer> hm = new HashMap<>(); // 단어 중복 체크하기 위한 HashMap
        for(int i=0; i<words.length; i++){
            if(i!=0){ // 첫번째 값은 무조건 HashMap에 추가
                String one = words[i-1]; // 이전 단어
                String two = words[i]; // 현재 단어
                
                char last = one.charAt(one.length()-1); // 이전 단어의 마지막 알파벳
                char first = two.charAt(0); // 현재 단어의 첫 알파벳
                
                // 중복된 단어가 있거나 알파벳이 서로 같지 않은 경우
                if(hm.containsKey(two) || last != first){ 
                    zero[0] = (i%n)+1; // 번호
                    zero[1] = (i/n)+1; // 차례
                    return zero; // 끝말잇기가 실패했으므로 zero 배열 반환
                }
            }
            hm.put(words[i],1); // HashMap에 단어 삽입
        }
        return zero; // 끝말잇기가 성공적으로 끝났으므로 zero 배열 반환
    }
}