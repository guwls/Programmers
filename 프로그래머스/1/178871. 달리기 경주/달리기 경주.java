import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String call : callings) {
            int rank = map.get(call);
            
            players[rank] = players[rank - 1];
            players[rank - 1] = call;
            
            map.put(call, rank - 1);
            map.put(players[rank], rank);
        }
        
        return players;
    }
}