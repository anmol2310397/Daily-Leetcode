class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:gifts)
            pq.add(i);
        for(int i=1;i<=k;i++){
            int max=pq.poll();
            int sqrt=(int)Math.sqrt(max);
            pq.add(sqrt);
        }
        long sum=0;
        for(int i:pq){
            sum+=i;
            
        }
        return sum;
    }
}