class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int[] res = new int[nums.length];
        res[0] = 1;
        prefix[0] = 1;
        postfix[nums.length - 1] = 1;
        int prod = 1;
        for(int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int suffix = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            res[i] *= suffix;
            suffix *= nums[i];
        }
       
        return res;
    }
}
