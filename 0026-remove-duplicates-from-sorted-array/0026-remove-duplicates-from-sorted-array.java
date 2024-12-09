class Solution {
    public int removeDuplicates(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i:nums){
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else{
                map.put(i,1);
                nums[count]=i;
                count++;
                
            }
        }
        return count;
        
    }
}