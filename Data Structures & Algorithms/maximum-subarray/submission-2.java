class Solution {
    public int maxSubArray(int[] nums) {
        int currMax = 0;
        int res = Integer.MIN_VALUE;
        for(int n : nums) {
            currMax = Math.max(0, currMax);
            currMax += n;
            res = Math.max(res, currMax);
        }
        return res;
    }
}
