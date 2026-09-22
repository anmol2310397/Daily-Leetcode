class Solution {
    public int lastStoneWeight(int[] stones) {
      PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
      for(int i:stones){
        pq.add(i);
      }
      if(pq.size()==1)return pq.poll();
     
      while(pq.size()>1){
        int a=pq.poll();
        int b=pq.poll();
        if(a==b){
            //nothing
        }
        else
        pq.add(a-b);
      }
      if(pq.size()==1)return pq.poll();
      else return 0;
    }
}