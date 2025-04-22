class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isStart = true; // 단어의 시작인지 여부

        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                answer.append(ch);
                isStart = true;
            } else {
                if (isStart) {
                    answer.append(Character.toUpperCase(ch));
                    isStart = false;
                } else {
                    answer.append(Character.toLowerCase(ch));
                }
            }
        }

        return answer.toString();
    }
}