class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums)
            pq.add(i);
        int l=0;
        for(int i=0;i<k;i++){
            l=pq.poll();
        }
        return l;
    }
}