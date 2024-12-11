class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int left=0,max=0;
        for(int right=0;right<nums.length;right++){
            
            while(nums[right]-nums[left]>2*k){
                left+=1;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}