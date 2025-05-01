class Solution {
    public int[] numberOfPairs(int[] nums) {
        int pair=0,count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.values()){
            pair+=i/2;
            count+=i%2;
        }
        int ans[]=new int[2];
        ans[0]=pair;
        ans[1]=count;
        return ans;
    }
}