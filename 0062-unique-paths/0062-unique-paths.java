class Solution {
    int dp[][];
    public int uniquePaths(int m, int n) {
        dp=new int[m][n];
        // Arrays.fill(dp,-1);
        return rec(m-1,n-1);
    }
    public int rec(int m,int n){
        if(m==0 && n==0)return 1;
        if(m<0||n<0)return 0;
        if(dp[m][n]!=0)return dp[m][n];
        int left=rec(m,n-1);
        int up=rec(m-1,n);
        return dp[m][n]=left+up;
    }
}