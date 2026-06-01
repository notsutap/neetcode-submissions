class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int currMax = 0;
        int currMin = 0;
        int finMax = Integer.MIN_VALUE;
        int finMin = Integer.MAX_VALUE;
        for(int num : nums) {
            total += num;
            currMax = Math.max(currMax, 0);
            currMax += num;
            finMax = Math.max(finMax, currMax);

            currMin = Math.min(currMin, 0);
            currMin += num;
            finMin = Math.min(finMin, currMin);
        }
        if(finMax < 0) return finMax;
        int res = total - finMin;
        return Math.max(res, finMax);
        
    }
}