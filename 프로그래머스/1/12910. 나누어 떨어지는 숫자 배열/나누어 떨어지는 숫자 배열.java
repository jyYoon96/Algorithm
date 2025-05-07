import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int leng = 0;
        int a = 0;
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++) {
            a = arr[i]%divisor;
            if (a == 0) {
                leng++;
            }
        }
        
        int[] answer = new int[leng];
        int cnt = 0;
        for (int i=0; i<arr.length; i++) {
            a = arr[i]%divisor;
            if (a == 0) {
                answer[cnt] = arr[i];
                cnt++;
            }
        }
        
        if (cnt == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}