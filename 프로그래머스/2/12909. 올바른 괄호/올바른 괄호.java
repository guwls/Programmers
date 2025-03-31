import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
                continue;
            }
            
            if (stack.isEmpty()) return false;
            
            stack.pop();
            
        }
            
        return stack.isEmpty();
    }

}
