class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = 0;
        int height = 0;
        
        for(int[] businessCard : sizes) {
            width = Math.max(Math.max(businessCard[0], businessCard[1]), width);
            height = Math.max(Math.min(businessCard[0], businessCard[1]), height);
        }
        
        answer = width * height;
        
        
        return answer;
    }
}