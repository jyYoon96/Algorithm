import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int leng = nums.length;
        
        Set<Integer> foketmon = new HashSet<Integer>();
        
        for (int num : nums) {
            foketmon.add(num);
        }
        
        int setSize = foketmon.size();
        
        if (setSize < leng/2) {
            answer = setSize;
        } else {
            answer = leng/2;
        }
        return answer;
    }
}