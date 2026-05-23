class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2*n];
        int i=0;
        while(i<n){
            ans[i]=nums[i];
            i++;
        }
        int k=i;
        while(i>0){
            i--;
            ans[k]=nums[i];
            k++;
        }
        return ans;
    }
}