class Solution {
    public int uniquePaths(int m, int n) {
        int i = 0;
        int j = 0;

        int[][] dp = new int[m][n];
        for(int k =0;k < m;k++){
            Arrays.fill(dp[k],0);
        }
        int res = memoization(m,n,i,j,dp);
        return res;

    }

    public int memoization(int m,int n,int i,int j,int[][] dp){
        if(i == m-1 && j == n-1){
            return 1;
        }

        if(i < 0 || j < 0 || i >= m || j >= n){
            return 0;
        }

        if(dp[i][j] != 0){
            return dp[i][j];
        }

        dp[i][j] = memoization(m,n,i+1,j,dp) + memoization(m,n,i,j+1,dp);
        return dp[i][j];
    }
}