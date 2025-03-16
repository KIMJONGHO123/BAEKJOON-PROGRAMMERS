import java.util.*;
class Solution {
    public int solution(String dirs) {
        char StringArr [] = new char[dirs.length()];
        for(int i=0; i<dirs.length(); i++){    // 문자열을 문자배열로 넣었다.
            StringArr[i] = dirs.charAt(i);
        }
        int x=0;
        int y=0;
        int tmpx=x;
        int tmpy=y;
        Set <String>hs = new HashSet<>();
        for(int j=0; j<StringArr.length;j++){
            if(StringArr[j] == 'U'){
                tmpy++;
            }else if(StringArr[j] == 'D'){
                tmpy--;
            }else if(StringArr[j] == 'R'){
                tmpx++;
            }else if(StringArr[j] == 'L'){
                tmpx--;
            }
            
            if((tmpy<=5 && tmpy>=-5) && (tmpx<=5 && tmpx>=-5)){
                String first = x+","+y+">>"+tmpx+","+tmpy;
                String second = tmpx+","+tmpy+">>"+x+","+y;
                hs.add(first);
                hs.add(second);
                x=tmpx;
                y=tmpy;
            }else{
                tmpx=x;
                tmpy=y;
            }
        
            
        }
        return hs.size()/2;
    }
}