import java.util.Arrays;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            }
            else {
                count--;
                if (count < 0) {
                    answer = false;
                    
                    return answer;
                }
            }
        }
        
        if (count == 0) {
            answer = true;
        }
        else {
            answer = false;
        }
        
        return answer;
    }
}