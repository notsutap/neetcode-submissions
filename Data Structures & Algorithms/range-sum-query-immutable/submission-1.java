class NumArray {
    int[] prefix;
    public NumArray(int[] nums) {

        prefix = new int[nums.length + 1];
        int total = 0;
        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
            prefix[i + 1] = total;
        }
    }
    
    public int sumRange(int left, int right) {
        int prefixRight = prefix[right + 1];
        int prefixLeft = prefix[left];
        return(prefixRight - prefixLeft);
    }
}


/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */