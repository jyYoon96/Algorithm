import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = new int[arr.length];
        answer[0] = arr[0];
        int top = 0;
        
        for (int i=1; i<arr.length; i++) {
            if (answer[top] != arr[i]) {
                answer[++top] = arr[i];
            }
        }

        return Arrays.copyOf(answer, top+1);
    }
}