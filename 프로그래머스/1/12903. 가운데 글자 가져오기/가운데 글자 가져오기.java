class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split("");
        
        int div = arr.length / 2;
        
        if (arr.length % 2 == 0) {
            answer = arr[div-1] + arr[div];
        }
        else {
            answer = arr[div]; 
        }
        
        return answer;
    }
}