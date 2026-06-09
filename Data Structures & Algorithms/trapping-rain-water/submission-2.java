class Solution {
    public int trap(int[] height) {
        int water = 0;
        int res = 0;
        int maxL = 0;
        int maxR = 0;
        int l = 0, r = height.length - 1;
        while(l <= r) {
            if(maxL <= maxR) {
                water = maxL - height[l];
                if(water < 0) water = 0;
                res += water;
                maxL = Math.max(maxL, height[l]);
                l++;
            } else {
                water = maxR - height[r];
                if(water < 0) water = 0;
                res += water;
                maxR = Math.max(maxR, height[r]);
                r--;
            }
        }
        return res;
    }
}
