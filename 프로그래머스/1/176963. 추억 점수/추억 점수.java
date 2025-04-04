import java.util.*;


class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for (int k=0; k < name.length; k++) {
            map.put(name[k], yearning[k]);
        }
        
        for (int i=0; i<photo.length; i++) {
            int sumNumber = 0;
            for (String n : photo[i]) {
                if (map.containsKey(n)) { // 점수가 있는 경우
                    sumNumber += map.get(n);
                }
            }
            answer[i] = sumNumber;
        }
        return answer;
    }
}