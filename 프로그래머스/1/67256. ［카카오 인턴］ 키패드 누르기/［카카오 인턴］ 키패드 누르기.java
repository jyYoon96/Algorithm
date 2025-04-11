import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        // 키패드 좌표 설정
        int[][] position = {
            {3, 1}, // 0
            {0, 0}, {0, 1}, {0, 2},
            {1, 0}, {1, 1}, {1, 2},
            {2, 0}, {2, 1}, {2, 2}
        };

        int[] leftPos = {3, 0};  // '*' 위치
        int[] rightPos = {3, 2}; // '#' 위치

        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                answer.append("L");
                leftPos = position[num];
            } else if (num == 3 || num == 6 || num == 9) {
                answer.append("R");
                rightPos = position[num];
            } else {
                int[] target = position[num];
                int leftDist = Math.abs(leftPos[0] - target[0]) + Math.abs(leftPos[1] - target[1]);
                int rightDist = Math.abs(rightPos[0] - target[0]) + Math.abs(rightPos[1] - target[1]);

                if (leftDist < rightDist) {
                    answer.append("L");
                    leftPos = target;
                } else if (leftDist > rightDist) {
                    answer.append("R");
                    rightPos = target;
                } else {
                    if (hand.equals("right")) {
                        answer.append("R");
                        rightPos = target;
                    } else {
                        answer.append("L");
                        leftPos = target;
                    }
                }
            }
        }

        return answer.toString();
    }
}