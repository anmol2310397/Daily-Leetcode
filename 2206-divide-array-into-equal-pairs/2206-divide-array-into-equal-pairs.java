class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
      
        int count=0;
        for(int i:map.values()){
            if(i%2==0)
                count+=i/2;
        }
        return count==(nums.length/2)?true:false;
    }
}