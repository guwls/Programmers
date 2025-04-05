class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int temp = x;

        while (temp > 0) {
            sum += temp % 10;  // 마지막 자리 수 더하기
            temp /= 10;        // 마지막 자리 제거
        }

        return x % sum == 0;
    }
}