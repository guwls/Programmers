import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        // 리스트 생성 
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        
        if (list.size() == 0) {
            list.add(-1);
        }
        
        // 리스트의 크기만큼 정수형 배열을 생성
        int[] answer = new int[list.size()];
        
        // 리스트 값을 배열에 대입
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        // 배열 오름차순 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}