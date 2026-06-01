class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int r = 0;
        for(r = 0; r < nums.length; r++) {
            int count = 1;
            while(r + 1 < nums.length && nums[r] == nums[r + 1]) {
                count++;
                r++;
            }
            for(int i = 0; i < Math.min(2, count);i++) {
                nums[l] = nums[r];
                l++;
            }
            
        }
        return l;
    }
}