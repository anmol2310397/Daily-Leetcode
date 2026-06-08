class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int result=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            sum=Math.max(sum+nums[i],nums[i]);
            result=Math.max(sum,result);
        }
    return result;
    }
}