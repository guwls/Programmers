class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String connect = "";
        int product = 0;
        
        connect = String.valueOf(a) + String.valueOf(b);
        product = 2 * a * b;
        
        if (Integer.parseInt(connect) >= product) {
            answer = Integer.parseInt(connect);
        }
        else {
            answer = product;
        }
        
        return answer;
    }
}