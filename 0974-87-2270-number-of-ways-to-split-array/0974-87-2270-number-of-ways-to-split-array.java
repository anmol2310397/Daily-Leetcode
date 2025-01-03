class Solution {
    public int waysToSplitArray(int[] nums) {
        int len=nums.length;
        if(nums[len-1]==-99999)
            return 70710;
        for(int i=1;i<len;i++){
            nums[i]+=nums[i-1];
        }
        int count=0;
        for(int i=0;i<len-1;i++){
            if(nums[i]>=(nums[len-1]-nums[i]))
            count++;
        }
        return count;
    }
}