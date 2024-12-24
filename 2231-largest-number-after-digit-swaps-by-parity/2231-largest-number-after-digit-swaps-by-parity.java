import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int largestInteger(int num) {

        PriorityQueue<Integer> odd = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> even = new PriorityQueue<>(Collections.reverseOrder());

        String numStr = Integer.toString(num);
        for (char ch : numStr.toCharArray()) {
            int digit = ch - '0';
            if (digit % 2 == 0) {
                even.add(digit);
            } else {
                odd.add(digit);
            }
        }

 
        StringBuilder result = new StringBuilder();
        for (char ch : numStr.toCharArray()) {
            int digit = ch - '0';
            if (digit % 2 == 0) {
                result.append(even.poll());
            } else {
                result.append(odd.poll());
            }
        }

        return Integer.parseInt(result.toString());
    }
}
