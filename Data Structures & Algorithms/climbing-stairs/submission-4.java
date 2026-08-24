class Solution {
    public int climbStairs(int n) {
        // int[] dp = new int[n + 1];
        // dp[n] = 1;
        // dp[n - 1] = 1;
        int[] dp = new int[]{1, 1};
        int temp = 0;
        for(int i = n - 2; i >= 0; i--) {
            temp = dp[0];
            dp[0] += dp[1];
            dp[1] = temp;
        }
        return dp[0];
    }
}
