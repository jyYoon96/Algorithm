import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> partMap = new HashMap<>();
        
        for (String name : participant) {
            partMap.put(name, partMap.getOrDefault(name, 0) + 1);
        }

        for (String name : completion) {
            partMap.put(name, partMap.get(name) - 1);
        }

        // 완주하지 못한 사람 찾기
        for (String key : partMap.keySet()) {
            if (partMap.get(key) > 0) {
                return key;
            }
        }
        
        return "";
    }
}