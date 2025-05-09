import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        // 문자를 key, 키 입력 수를 value로 담을 맵
        Map<Character, Integer> map = new HashMap<>();

        for (String s : keymap) {
            for (int i = 0; i < s.length(); i++) {
                char key = s.charAt(i);
                // key가 존재하는 경우 현재 저장된 값, 없는 경우 i + 1
                int value = map.getOrDefault(key, i + 1);

                // key의 값이 value와 i + 1 중 작은 값으로 저장
                map.put(key, Math.min(value, i + 1));
            }
        }

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                char key = targets[i].charAt(j);

                if (map.containsKey(key)) {
                    // key가 존재하는 경우 answer에 value 저장
                    answer[i] += map.get(key);
                } else {
                    // key가 존재하지 않는 경우 -1
                    answer[i] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}