class Solution {
    public int rob(int[] nums) {
        // int[] dp = new int[nums.length];
        if(nums.length == 1) return nums[0];
        int[] dp = new int[]{0, 0, 0};
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        int temp = 0;
        for(int i = 2; i < nums.length; i++) {
            dp[2] = Math.max(dp[0] + nums[i], dp[1]);
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return Math.max(dp[0], dp[1]);
    }
}
