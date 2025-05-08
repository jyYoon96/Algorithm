import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        HashMap<String,Integer> map = new HashMap<>();
        String a = "";
        String b = "";

        for(int i = 0;i<words.length;i++){
            b=words[i];
            if(i!=0&&(map.containsKey(b)
                      ||!b.startsWith(a.substring(a.length()-1)))) {
                answer[0]=i%n+1;
                answer[1]=(i+n)/n;
                break;
            } else map.put(b,1);
            a=b;

        }

        return answer;
    }
}