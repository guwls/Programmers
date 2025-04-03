class Solution {
    public long solution(long n) {
        long answer = 0;
        long sqrt = 0;
        
        sqrt = (long)(Math.sqrt(n));
        
        if (sqrt * sqrt != n) {
            answer = -1;
        }
        else {
            answer = (long)Math.pow(sqrt + 1, 2);
        }
        
        return answer;
    }
}