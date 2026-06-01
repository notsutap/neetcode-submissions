class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currMax = 0;
        int currMin = 0;
        int maxSum = nums[0];
        int minSum = nums[0];
        int total = 0;
        for (int n : nums) {
            total += n;

            currMax = Math.max(currMax, 0);
            currMax += n;
            maxSum = Math.max(currMax, maxSum);

            currMin = Math.min(currMin, 0);
            currMin += n;
            minSum = Math.min(currMin, minSum);
        }
        if (maxSum < 0) {
            return maxSum;
        }
        int res = Math.max(maxSum, total - minSum);
        return res;
    }
}