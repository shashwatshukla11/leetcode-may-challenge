class Solution {
    public int numTilings(int n) {
        int MOD = 1_000_000_007;

        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 5;

        // dp[i] will store the number of ways to tile 2 x i board
        long[] dp = new long[n + 1];
        dp[0] = 1; // base case: empty board
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;

        for (int i = 4; i <= n; i++) {
            // Recurrence relation: dp[i] = 2 * dp[i - 1] + dp[i - 3]
            dp[i] = (2 * dp[i - 1] + dp[i - 3]) % MOD;
        }

        return (int) dp[n];
    }
}
