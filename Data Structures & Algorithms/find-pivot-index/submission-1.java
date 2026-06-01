class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length + 1];
        int [] postfix = new int[nums.length + 1];
        prefix[0] = 0;
        postfix[nums.length] = 0;
        int total = 0;
        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
            prefix[i + 1] = total;
        }
        total = 0;
        for(int i = nums.length - 1; i >= 0; i--) {
            total += nums[i];
            postfix[i] = total;
        }
        for(int i = 0; i < nums.length; i++) {
            if(prefix[i] == postfix[i + 1]) return i;
        }
        for(int n : prefix) System.out.print(n + " ");
        System.out.println();
        for(int n : postfix) System.out.print(n + " ");
        return -1;
    }
}