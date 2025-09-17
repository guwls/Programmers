import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        
        long sum = 0L;
        int n = A.length;
        
        for (int i = 0; i < n; i++) {
            answer += (long) A[i] * B[n-1 - i];
        }

        return (int)answer;
    }
}