import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        
        // 당일포함 10일동안 할인이 되므로 discount 길이에서 9를 뺀 순서까지 반복문
        for (int i=0 ; i < discount.length - 9; i++) {
            // discount를 돌면서 갯수 세기
            for (int j=i; j< i+10; j++) {
                map.put(discount[j], map.getOrDefault(discount[j], 0) + 1);
            }
            // want와 방금 센 할인 목록 비교
            boolean check = true;
            for (int k=0; k < want.length; k++) {
                if (!map.containsKey(want[k]) || map.get(want[k]) != number[k]) {
                    check = false;
                    break;
                }
            }
            // 체크 통과했으면 가능한 날 + 1
            if (check) {
                answer++;
            }
            
            // 해쉬맵 초기화
            map.clear();
            
        }
        
        return answer;
    }
    
}