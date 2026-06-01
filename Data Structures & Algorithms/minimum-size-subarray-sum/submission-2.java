class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int windowLength = Integer.MAX_VALUE;
        int sum = 0;
        int l = 0;
        for(int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while(sum >= target) {
                windowLength = Math.min(r - l + 1, windowLength);
                sum -= nums[l];
                l++;
            }
        }
        if(windowLength == Integer.MAX_VALUE) return 0;
        return windowLength;
    }
}