class Solution {
    int dp[][];
    public int maxSatisfaction(int[] satisfaction) {
        int n=satisfaction.length;
        dp=new int[n][n+1];
        for(int []arr:dp){
            Arrays.fill(arr,-1);
        }
        Arrays.sort(satisfaction);
        return rec(satisfaction,0,1,n);
    }
    public int rec(int []nums,int i, int time, int n){
        if(i==n)return 0;
        if(dp[i][time]!=-1)return dp[i][time];
        int pick=nums[i]*time+rec(nums,i+1,time+1,n);
        int notPick=rec(nums,i+1,time,n);
        return dp[i][time]=Math.max(pick,notPick);
    }
}