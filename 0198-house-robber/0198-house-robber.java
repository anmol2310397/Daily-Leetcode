class Solution {
    int dp[];
    public int rob(int[] nums) {
        dp=new int[nums.length];
        Arrays.fill(dp, -1);
        return rec(nums.length-1,nums);
    }
    public int rec(int idx,int[] nums){
        if(idx==0)return nums[idx];
        if(idx<0)return 0;
        if(dp[idx]!=-1)
        return dp[idx];
        int pick=nums[idx]+rec(idx-2,nums);
        int notPick=rec(idx-1,nums);
        return dp[idx]= Math.max(pick,notPick);
    }
}