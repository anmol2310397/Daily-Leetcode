class Solution {
    int dp[][];
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid[0].length,m=obstacleGrid.length;
        if (obstacleGrid[0][0] == 1 ||
    obstacleGrid[m-1][n-1] == 1)
    return 0;
        dp=new int[obstacleGrid.length][obstacleGrid[0].length];
        return rec(obstacleGrid.length-1,obstacleGrid[0].length-1,obstacleGrid);
    }
    public int rec(int m,int n,int[][] arr){
        if(m==0 && n==0)return 1;
        if(m<0 || n<0)return 0;
        if(arr[m][n]==1)return 0;
        if(dp[m][n]!=0)return dp[m][n];
        int left=rec(m-1,n,arr);
        int right=rec(m,n-1,arr);
        return dp[m][n]=left+right;
    }
}