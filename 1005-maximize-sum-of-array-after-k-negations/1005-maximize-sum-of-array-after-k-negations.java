class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        for(int i=0;i<k;i++){
            Arrays.sort(nums);
            nums[0]*=-1;
        }
        int ans=0;
        for(int i:nums){
            ans+=i;
        }
        return ans;
    }
}