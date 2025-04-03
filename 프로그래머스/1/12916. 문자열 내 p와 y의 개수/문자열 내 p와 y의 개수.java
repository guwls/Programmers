class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCnt = 0;
        int yCnt = 0;
        
        char[] chars = s.toCharArray();
        
        for (char ch : chars) {
            if (ch == 'p' || ch == 'P') {
                pCnt++;
            }
            
            if (ch == 'y' || ch == 'Y') {
                yCnt++;
            }
        }
        
        if (pCnt != yCnt) {
            answer = false;
        }
        else {
            answer = true;
        }
        
        return answer;
    }
}