class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,prod=1;
        int num=n;
        while(num>0){
            int r=num%10;
            sum+=r;
            prod*=r;
            num/=10;
        }
        return prod-sum;
    }
}