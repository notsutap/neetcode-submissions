class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length + 1];
        int[] postfix = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        for(int i = nums.length - 1; i >= 0; i--) {
            postfix[i] = postfix[i + 1] + nums[i];
        }
        for(int i = 0; i < nums.length; i++) {
        if(postfix[i] == prefix[i + 1]) return i; 
        }
        return -1;
    }
}