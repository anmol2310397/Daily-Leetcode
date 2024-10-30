class Solution {
    public void moveZeroes(int[] nums) {
        int arr[]=new int[nums.length];
        int hero=0,b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                hero++;
            else
            {
                arr[b]=nums[i];
                b++;
            }
        }
        for(int i=0;i<nums.length-hero;i++){
            nums[i]=arr[i];
        }
        for(int i=nums.length-hero;i<nums.length;i++){
            nums[i]=0;
        }
    }
}