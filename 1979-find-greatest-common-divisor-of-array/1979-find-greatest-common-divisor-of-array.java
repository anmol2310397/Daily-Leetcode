class Solution {
    public int findGCD(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        return hcf(nums[0],nums[len-1]);
    }
    public int hcf(int a,int b){
        int ans=1;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0)ans=i;
        }
        return ans;
    }
}