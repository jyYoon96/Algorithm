import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] arrayStr = s.split("");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for (int i=0; i < arrayStr.length; i++) {
            if (!map.containsKey(arrayStr[i])) {
                map.put(arrayStr[i], i);
                answer[i]=-1;
            } else {
                int j = map.get(arrayStr[i]);
                answer[i] = i-j;
                map.put(arrayStr[i], i);
            }
        }
        
        return answer;
    }
}