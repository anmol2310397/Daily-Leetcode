class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,ans=0;
        for(int i:nums){
            if(i==1){
                ans++;
            }
            else ans=0;
            max=Math.max(ans,max);
        }
        return max;
    }
}