class Solution {
    public int findDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]);
            if (nums[idx] < 0)
                return idx;
            nums[idx] = -nums[idx];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]*=-1;
            }
        }
        return -1;
    }
}