class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int zero = 0;
        
        for (int num : lottos) {
            if (num != 0) {
                for (int win : win_nums) {
                    if (num == win) {
                        cnt++;
                        break;
                    }
                }
            } else {
                zero++;
            }
        }
        
        answer[0] = 7 - (cnt + zero);
        answer[1] = 7 - cnt;
        
        if (answer[0] == 7) {
            answer[0] = 6;
        }
        
        if (answer[1] == 7) {
            answer[1] = 6;
        }
        
        return answer;
    }
}