class Solution {
    int dp[][];
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        dp=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-100000;
            }
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
         int ans = rec(0, i, matrix.length, matrix);
           min =Math.min(ans, min);
        }
        return min;
    }

    public int rec(int a, int b, int n, int[][] mat) {
        if (a >= n || b >= n || b < 0 || a < 0)
            return Integer.MAX_VALUE;
        if(dp[a][b]!=-100000)return dp[a][b];
        if (a == n-1)
            return mat[a][b];
        int sum1 = rec(a + 1, b - 1, n, mat);
        int sum2 = rec(a + 1, b, n, mat);
        int sum3 = rec(a + 1, b + 1, n, mat);
        return dp[a][b]=mat[a][b]+Math.min(sum1, Math.min(sum2, sum3));
    }
}