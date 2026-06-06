class Solution {
    public int minimumCost(int[] cost) {
      PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
      for(int c:cost){
        pq.add(c);
      }  
      int sum=0;
      int k=1;
      while(!pq.isEmpty()){
        if(k%3!=0)
        sum+=pq.poll();
        else
        pq.poll();
        k++;
      }
      return sum;
    }
}