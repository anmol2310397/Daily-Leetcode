class Solution {
    public long sumAndMultiply(int n) {
        if(n==0)return 0;
        int num=n;
        int sum=0;
        String ans="";
        while(num>0){
            int rem=num%10;
            if(rem==0){
                num/=10;
                continue;
            }
            sum+=rem;
            ans=String.valueOf(rem)+ans;
            num/=10;
        }
        long a=Long.parseLong(ans);
        a*=(long)sum;
        return a;
    }
}