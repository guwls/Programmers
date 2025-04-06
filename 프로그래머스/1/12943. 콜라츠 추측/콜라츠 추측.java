class Solution {
    public int solution(int num) {
        long temp = num; 
        int cnt = 0;

        while (temp != 1) {
            if (temp % 2 == 0) {
                temp /= 2;
            } else {
                temp = (temp * 3) + 1;
            }
            cnt++;

            if (cnt > 500) return -1;
        }

        return cnt;
    }
}