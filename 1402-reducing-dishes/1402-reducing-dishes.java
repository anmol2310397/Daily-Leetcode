
import java.util.*;

class Solution {
    int dp[][];

    public int maxSatisfaction(int[] satisfaction) {
        int n = satisfaction.length;
        Arrays.sort(satisfaction);

        dp = new int[n][n + 1];

        for (int[] arr : dp) {
            Arrays.fill(arr, Integer.MIN_VALUE);
        }

        return rec(satisfaction, 0, 0, n);
    }

    int rec(int[] nums, int i, int time, int n) {
        if (i == n) return 0;

        if (dp[i][time] != Integer.MIN_VALUE)
            return dp[i][time];

        int pick = nums[i] * (time + 1)
                 + rec(nums, i + 1, time + 1, n);

        int notPick = rec(nums, i + 1, time, n);

        return dp[i][time] = Math.max(pick, notPick);
    }
}
