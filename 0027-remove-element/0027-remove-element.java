class Solution {
    public int removeElement(int[] nums, int val) {
        int cnt=0,i=0;
        int ans[]=new int[nums.length];
        for(int num:nums)
        {
            if(num!=val){
                cnt++;
                ans[i]=num;
                i++;
            }
        }
        for(int j=0;j<cnt;j++)
            nums[j]=ans[j];
        return cnt;
    }
}