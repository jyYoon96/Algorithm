import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length]; 
        ArrayList<Integer> lst = new ArrayList<>(k);
        
        for (int i = 0; i < score.length; i++) {
            lst.add(score[i]);
            lst.sort(Comparator.naturalOrder());
            if (lst.size() > k) {
                lst.remove(0);
            }
            answer[i] = lst.get(0);
        }    
        return answer;
    }
}