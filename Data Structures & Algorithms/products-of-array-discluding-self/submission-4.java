class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            int product = 1;
            for (int j = 0; j < res.length; j++) {
                if (j == i)
                    continue;
                product *= nums[j];
            }
            res[i] = product;
        }
        return res;
    }
}
