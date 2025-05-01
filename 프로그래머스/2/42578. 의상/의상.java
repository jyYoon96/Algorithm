import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String[] clothe : clothes) {
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        }
        
        for (int cnt : map.values()) {
            answer *= (cnt + 1); // 해당 종류의 옷을 입는 경우 + 안 입는 경우
        }
        
        return answer-1;
    }
}