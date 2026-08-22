class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        int ans[]=new int[nums.length];
        arr[0]=1;
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]*nums[i-1];
        }
           ans[nums.length-1]=1;

        for(int i=nums.length-2;i>=0;i--){
            ans[i]=ans[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=ans[i]*arr[i];
        }
        return ans;
    }
}