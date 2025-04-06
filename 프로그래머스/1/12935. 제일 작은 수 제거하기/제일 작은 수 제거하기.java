import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int[] answer;
        
        for (int num : arr) {
            list.add(num);
        }
        
        boolean min = list.removeIf(n -> n == Collections.min(list));
        
        if (!list.isEmpty()) {
            answer = list.stream().mapToInt(Integer::intValue).toArray();
        }
        else {
            answer = new int[]{-1};
        }
        
            
        return answer;
    }
}