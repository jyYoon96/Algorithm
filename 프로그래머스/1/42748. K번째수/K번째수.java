import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i=0; i < commands.length; i++) {
            int q = commands[i][0];
            int w = commands[i][1];
            int e = commands[i][2];

            int[] array1 = Arrays.copyOfRange(array, q - 1, w);
            
            Arrays.sort(array1);
            answer[i] = array1[e - 1];
        }
        
        return answer;
    }
}