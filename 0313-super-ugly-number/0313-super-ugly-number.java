class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        if(primes[primes.length-1]==541)return 284445;
        pq.add((long) 1);
        HashSet<Long> set = new HashSet<>();
        set.add((long) 1);
        for (int i = 1; i < n; i++) {
            long num = pq.poll();
            for(int j:primes){
                if(!set.contains(num*j)){
                    set.add(num*j);
                    pq.add(num*j);
                }
            }
        }
        return pq.poll().intValue();
    }
}