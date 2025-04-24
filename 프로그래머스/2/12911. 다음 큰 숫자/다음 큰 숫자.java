class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String origin = Integer.toBinaryString(n);
        origin = origin.replace("0", "");
        int originLeng = origin.length();
        
        int m = n+1;
        String next = Integer.toBinaryString(m);
        next = next.replace("0", "");
        int nextLeng = next.length();
        
        while (originLeng != nextLeng) {
            m++;
            
            next = Integer.toBinaryString(m);
            next = next.replace("0", "");
            nextLeng = next.length();
        }
        answer = m;
        
        return answer;
    }
}