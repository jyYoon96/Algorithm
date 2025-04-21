import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 10; i >= 0; i--) { 
            long unit = (long) Math.pow(10, i);
            if (n >= unit) {
                int digit = (int) (n / unit);
                list.add(digit);
                n %= unit;
            } else if (!list.isEmpty()) {
                list.add(0); // 중간 0 채우기
            }
        }

        Collections.reverse(list);

        // 리스트를 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}