import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < survey.length; i++) {
            int num = choices[i];
            char nbti;

            if (num > 4) {
                nbti = survey[i].charAt(1); 
                map.put(nbti, map.getOrDefault(nbti, 0) + (num - 4));
            } else if (num < 4) {
                nbti = survey[i].charAt(0);
                map.put(nbti, map.getOrDefault(nbti, 0) + (4 - num));
            }
        }

        char[][] types = { {'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'} };
        StringBuilder sb = new StringBuilder();

        for (char[] pair : types) {
            char type1 = pair[0], type2 = pair[1];
            int score1 = map.getOrDefault(type1, 0);
            int score2 = map.getOrDefault(type2, 0);

            if (score1 >= score2) {
                sb.append(type1);
            } else {
                sb.append(type2);
            }
        }

        return sb.toString();
    }
}