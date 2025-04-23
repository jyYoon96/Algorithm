import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        
        while (!s.equals("1")) {
            int sLength = s.length();
            String str = s.replace("0", "");
            int strLength = str.length();
            
            answer[1] += sLength - strLength;
            s = Integer.toBinaryString(strLength);
            cnt++;
        }
        
        answer[0] = cnt;
        
        return answer;
    }
}