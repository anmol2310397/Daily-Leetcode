class Solution {
    int dp[][];
    public int minPathSum(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        dp=new int[m][n];
        return rec(m-1,n-1,grid);
    }
    public int rec(int m,int n,int [][]grid){
        if(m==0 && n==0)
        return grid[m][n];
        if(m<0||n<0)
        return (int)1e9;
        if(dp[m][n]!=0)return dp[m][n];
        int up=grid[m][n]+rec(m-1,n,grid);
        int left=grid[m][n]+rec(m,n-1,grid);
        return dp[m][n]=Math.min(up,left);
    }
}