class Solution {
    public void sortColors(int[] nums) {
        int[] bucket = new int[3];
        int index = 0;
        for(int n : nums) bucket[n]++;
        for(int i = 0; i < bucket.length; i++) {
            for(int j = 0; j < bucket[i]; j++) {
                nums[index] = i;
                index++;
            }
        }
    }
}