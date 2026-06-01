class Solution {
    public int trap(int[] height) {
        int maxL = height[0];
        int maxR = height[height.length - 1];
        int l = 0;
        int r = height.length - 1;
        int res = 0;
        int trap = 0;
        while(l < r) {
            if(maxL < maxR) {
                l++;
                maxL = Math.max(maxL, height[l]);
                trap = maxL - height[l];
            } else {
                r--;
                maxR = Math.max(maxR, height[r]);
                trap = maxR - height[r];
            }
            if(trap < 0) continue;
            res += trap; 
        }
        return res;
    }
}
