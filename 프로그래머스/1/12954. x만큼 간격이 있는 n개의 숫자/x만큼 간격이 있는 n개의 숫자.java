class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long s = 0;
        
        for (int i=0; i < n; i++) {
            s += x;
            answer[i] = s;
        }
        
        return answer;
    }
}