import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        int[] answer = new int[photo.length];
        
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++) {
            String[] row = photo[i];
                
            for (String photos : row) {
                
                answer[i] += map.getOrDefault(photos, 0);
            }
        }
        
        return answer;
    }
}