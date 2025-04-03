import java.util.Arrays;

class Solution {
    public static long solution(long n) {
		// String -> long으로 변환 후 바로 배열에 저장
    char[] digits = Long.toString(n).toCharArray();  
    
    Arrays.sort(digits); // 오름차순 정렬
    
    // 오름차순 배열 뒤집어서 바로 long으로
    StringBuilder sb = new StringBuilder(new String(digits)).reverse();
    
    return Long.parseLong(sb.toString());
}
}