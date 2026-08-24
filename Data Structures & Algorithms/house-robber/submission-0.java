class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length + 2];
        dp[nums.length-1] = nums[nums.length - 1];
        for(int i = nums.length - 1; i >= 0; i--) {
            dp[i] = Math.max(dp[i + 1], nums[i] + dp[i + 2]);
        }
        return dp[0];
    }
}
