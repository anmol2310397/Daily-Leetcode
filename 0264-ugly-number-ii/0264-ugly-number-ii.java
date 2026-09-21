class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        pq.add((long)1);
        HashSet<Long> set=new HashSet<>();
        set.add((long)1);
        for(int i=1;i<n;i++){
            long num=pq.poll();
            if(!set.contains(num*2)){
                pq.add(num*2);
                set.add(num*2);
            }
            if(!set.contains(num*3)){
                pq.add(num*3);
                set.add(num*3);
            }
            if(!set.contains(num*5)){
                pq.add(num*5);
                set.add(num*5);
            }
        }
        return pq.poll().intValue();
    }
}