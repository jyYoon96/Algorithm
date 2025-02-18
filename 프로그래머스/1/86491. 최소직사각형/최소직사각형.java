import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxLow = 0;
        int maxCol = 0;
        
        for (int i=0; i<sizes.length; i++) {
            int low=Math.max(sizes[i][0],sizes[i][1]);
            maxLow=Math.max(maxLow,low);
            
            int col=Math.min(sizes[i][0],sizes[i][1]);
            maxCol=Math.max(maxCol,col);
        }
        answer = maxLow*maxCol;
        return answer;
    }
}