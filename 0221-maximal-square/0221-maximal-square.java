class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] dp = new int[n + 1];
        int maxSide = 0;

        for (int i = 1; i <= m; i++) {
            int diagonal = 0;

            for (int j = 1; j <= n; j++) {
                int top = dp[j];

                if (matrix[i - 1][j - 1] == '1') {
                    dp[j] = 1 + Math.min(
                        Math.min(dp[j], dp[j - 1]),
                        diagonal
                    );

                    maxSide = Math.max(maxSide, dp[j]);
                } else {
                    dp[j] = 0;
                
            }
                diagonal = top;
            }
        }

        return maxSide * maxSide;
    }
}