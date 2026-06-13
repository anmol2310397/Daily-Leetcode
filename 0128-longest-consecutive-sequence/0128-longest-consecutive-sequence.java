class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int count=1;
        int max=1;
        for(int i:set){
            if(set.contains(i-1))
            continue;
            int temp=i;
            while(set.contains(temp+1)){
                count++;
                temp++;
            }
            max=Math.max(max,count);
            count=1;
        }
        return max;
    }
}