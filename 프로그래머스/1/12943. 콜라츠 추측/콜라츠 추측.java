class Solution {
    public int solution(long num) {
        int answer = 0;
        int cnt = 0;
        
        if (num == 1) {
            return 0;
        }
        
        while (cnt != 500) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num *= 3;
                num += 1;
            }
            cnt += 1;
            
            if (num == 1) {
                answer = cnt;
                return answer;
            }
        }
        return -1;
    }
}