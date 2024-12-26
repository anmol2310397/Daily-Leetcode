class Solution {
    public int add(int n){
        int n1=n,sum=0;
        while(n1>0){
            sum+=n1%10;
            n1/=10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
     int rsum=0,asum=0;
        for(int i:nums){
            rsum+=i;
            if(i>9){
                asum+=add(i);
            }
            else
                asum+=i;
        }
        return Math.abs(asum-rsum);
    }
}