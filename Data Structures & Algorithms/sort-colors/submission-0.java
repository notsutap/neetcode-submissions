class Solution {
    public void sortColors(int[] nums) {
        int[] counts = new int[3];
        for(int i = 0; i < nums.length; i++) {
            counts[nums[i]]++;
        }

        int idx = 0;
        for(int i = 0; i < counts.length; i++) {
            for(int n = 0; n < counts[i]; n++) {
                nums[idx] = i;
                idx++;
            }
        }
    }
}