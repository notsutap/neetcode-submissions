class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int[] res = new int[nums.length];
        prefix[0] = 1;
        postfix[nums.length - 1] = 1;
        int prod = 1;
        for(int i = 0; i < nums.length - 1; i++) {
            prod *= nums[i];
            prefix[i + 1] =  prod;
        }
        prod = 1;
        for(int i = nums.length - 1; i > 0; i--) {
            prod *= nums[i];
            postfix[i - 1] = prod;
        }
        for(int i = 0; i < nums.length; i++) {
            res[i] = prefix[i] * postfix[i];
        }
        return res;
    }
}
