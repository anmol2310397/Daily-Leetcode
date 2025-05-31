class Solution {
    public int sumDigit(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int k=sumDigit(nums[0]);
        for(int i:nums){
            k=Math.min(sumDigit(i),k);
        }
        return k;
    }
}