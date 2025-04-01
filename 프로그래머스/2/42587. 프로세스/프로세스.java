import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            maxHeap.offer(priorities[i]);
            queue.offer(new int[] {priorities[i], i}); // 우선순위, 원래위치
        }
        
        while(!queue.isEmpty()) { // 큐가 비었다면
            int[] current = queue.poll(); // 큐에서 가장 앞에 있는 요소를 current 배열에 저장 
            
            // 현재 문서가 가장 높은 우선순위인지 확인 
            if(current[0] == maxHeap.peek()) { // 만약 current[0]값이 가장 높은 값이 맞으면 
                maxHeap.poll(); // 처리된 우선순위 제거
                answer++; // 몇 번째로 실행되는지 카운트
                
                // 목표 위치와 일치하면 종료
                if (current[1] == location) {
                    return answer;
                }
            } 
            else {
                queue.offer(current);
            }            
        }
        
        return answer;        
    }
}