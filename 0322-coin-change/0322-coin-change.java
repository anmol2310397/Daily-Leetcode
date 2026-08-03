class Solution {
    int[] dp;

    public int coinChange(int[] coins, int amount) {
        dp = new int[amount + 1];
        Arrays.fill(dp, -2); // -2 means not computed

        int ans = rec(amount, coins);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public int rec(int n, int[] coins) {
        if (n == 0) return 0;

        if (dp[n] != -2)
            return dp[n];

        int res = Integer.MAX_VALUE;

        for (int c : coins) {
            if (c <= n) {
                int sub = rec(n - c, coins);

                if (sub != Integer.MAX_VALUE) {
                    res = Math.min(res, sub + 1);
                }
            }
        }

        return dp[n] = res;
    }
}