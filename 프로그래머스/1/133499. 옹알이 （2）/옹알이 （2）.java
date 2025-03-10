import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] canbab = {"aya", "ye", "woo", "ma"};
 
        for (String word : babbling) {
            boolean isValid = true;
 
            String prev = "";
 
            for (String sound : canbab) {
                if (word.contains(sound + sound)) {
                    isValid = false;
                    break;
                }

                word = word.replace(sound, " ");
            }
 
            if (isValid && word.trim().isEmpty()) {
                answer++;
            }
        }
 
        return answer;
    }
}