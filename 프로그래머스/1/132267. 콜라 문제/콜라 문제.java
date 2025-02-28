class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int r = 0;
        
        while (n >= a) {
            r = n % a;
            // System.out.println(r);
            n = (n/a)*b;
            answer += n;
            n += r;
        }
        
        return answer;
    }
}