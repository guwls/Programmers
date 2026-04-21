class Solution {
    public String solution(int n) {
        String answer = "";
        int i = 0;
        String[] arr = {"수", "박"};
        
        while (i < n) {
            answer += ((i+1) % 2 == 0)? arr[1] : arr[0];
            if((i+1) == n) break;
            i++;
        }
        
        return answer;
    }
}