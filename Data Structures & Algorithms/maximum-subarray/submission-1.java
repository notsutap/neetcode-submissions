class Solution {
    public int maxSubArray(int[] nums) {
        int currMax = 0;
        int res = Integer.MIN_VALUE;
        for(int num : nums) {
            currMax = Math.max(currMax, 0);
            currMax += num;
            res = Math.max(currMax, res);
        }
        return res;
    }
}
