class Solution {
    public int[] searchRange(int[] nums, int target) {
      int count=0;
         int ans[]=new int[2];
      if(nums.length==0){
        ans[0]=-1;
        ans[1]=-1;
        return ans;
      }
     
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
            {
                ans[0]=i;
                count=1;
                break;
            }
            if(count==0)
            ans[0]=-1;
            count=0;
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                ans[1]=i;
                count=1;
                break;
            }
        }
        if(count==0)
        ans[1]=-1;
        return ans;
    }
}