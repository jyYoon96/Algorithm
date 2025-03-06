import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i=0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String player : callings) {
            int idx = map.get(player);

            // 선수 교체
            String temp = players[idx - 1];
            players[idx - 1] = player;
            players[idx] = temp;

            // 등수 업데이트
            map.put(player, idx - 1);
            map.put(temp, idx);
        }
        
        return players;
    }
}