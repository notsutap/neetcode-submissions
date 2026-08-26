class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        int m = coins.length;
        for(int i = 1; i <= amount; i++) {
            for(int j = 0; j < m; j++) {
                if(i >= coins[j]) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }
            }
        }
        if(dp[amount] > amount) return -1; return dp[amount];
    }
}
