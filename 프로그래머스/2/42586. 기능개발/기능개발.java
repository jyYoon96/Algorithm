import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[100];
        int a = 0;
        int b = 0;
        
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 0; i < speeds.length; i++) {
            a = (100-progresses[i])/speeds[i];
            b = (100-progresses[i])%speeds[i];
            
            if (b == 0) {
                q.add(a);
            } else {
                q.add(a+1);
            }
        }
        
        List<Integer> result = new ArrayList<>();
        int current = q.poll();
        int count = 1;

        while (!q.isEmpty()) {
            int next = q.poll();
            if (current >= next) {
                count++;
            } else {
                result.add(count);
                count = 1;
                current = next;
            }
        }
        result.add(count);

        return result.stream().mapToInt(i->i).toArray();
    }
}