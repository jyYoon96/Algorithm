import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int total = 0;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i=0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i],0)+1);
        }
        
        List<Integer> val = new ArrayList<>(map.values());
        val.sort(Collections.reverseOrder());
        
        for (int i=0; i < val.size(); i++) {
            total += val.get(i);
            answer++;
            if (total >= k) {
                break;
            }
        }
        
        return answer;
    }
}