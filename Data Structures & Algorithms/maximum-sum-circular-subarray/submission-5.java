class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currMax = 0;
        int resMax = Integer.MIN_VALUE;
        int currMin = 0;
        int total = 0;
        int resMin = Integer.MAX_VALUE;
        for(int n : nums) {
            total += n;
            currMax = Math.max(0, currMax);
            currMax += n;
            resMax = Math.max(currMax, resMax);
        }
        for(int n : nums) {
            currMin = Math.min(0, currMin);
            currMin += n;
            resMin = Math.min(currMin, resMin);
        }
        if(resMax < 0) return resMax;
        int circularMax = total - resMin;
        if(circularMax > resMax) return circularMax; return resMax;
        
    }
}