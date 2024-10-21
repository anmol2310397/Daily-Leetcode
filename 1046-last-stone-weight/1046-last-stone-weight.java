import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        // Add all stones to the priority queue
        for (int stone : stones) {
            pq.add(stone);
        }
        
        // Process the stones until there's one or no stone left
        while (pq.size() > 1) {
            int y = pq.poll(); // heaviest stone
            int x = pq.poll(); // second heaviest stone
            
            // If the stones are not the same weight, add the difference back to the queue
            if (x != y) {
                pq.add(y - x);
            }
        }
        
        // If there's one stone left, return its weight; otherwise return 0
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
