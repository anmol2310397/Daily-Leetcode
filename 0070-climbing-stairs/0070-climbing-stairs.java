class Solution {
    int dp[];
    public int climbStairs(int n) {
        dp=new int[n+1];
        return rec(n);
    }
    public int rec(int n){
        if(n==0) return 1;
        if(n==1) return 1;
        if(dp[n]!=0)return dp[n];
        int left= rec(n-1);
        int right=rec(n-2);
        return dp[n]=rec(n-1)+rec(n-2);   
    }
}