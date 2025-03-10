class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = section[0];
        answer += 1;
        
        for (int item : section) {
            if (start + m > item) {
                continue;
            }            
        
            start = item;
            answer += 1;
            
        }
        
        
        return answer;
    }
}