class NumArray {
    int[] prefix;
    public NumArray(int[] nums) {

        prefix = new int[nums.length];
        int total = 0;
        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
            prefix[i] = total;
        }
    }
    
    public int sumRange(int left, int right) {
        int prefixRight = prefix[right];
        int prefixLeft = 0;
        if(left > 0) {
            prefixLeft = prefix[left - 1];
        } else {
            prefixLeft = 0;
        }
        return(prefixRight - prefixLeft);
    }
}


/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */