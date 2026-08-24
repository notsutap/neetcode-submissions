class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        // int[] dp = new int[nums.length + 1];
        // dp[nums.length - 1] = nums[nums.length - 1];
        int[] dp = new int[]{nums[n - 1], 0};
        int temp = 0;
        for(int i = nums.length - 2; i >= 0; i--) {
            temp = dp[0];
            dp[0] = Math.max(dp[0], nums[i] + dp[1]);
            dp[1] = temp;
        }
        return dp[0];
    }
}
