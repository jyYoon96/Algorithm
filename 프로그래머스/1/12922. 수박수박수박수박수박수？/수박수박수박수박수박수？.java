class Solution {
    public String solution(int n) {
        String answer = "";
        String str = "수박";
        int cnt = n/2;
        int num = n%2;
        for (int i = 0; i<cnt; i++) {
            answer += str;
        }
        if (num != 0) {
            answer += "수";
        }

        return answer;
    }
}