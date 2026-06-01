class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1; 
            int right = nums.length - 1;
            while(left < right) {
                if(nums[i] + nums[left] + nums[right] == 0) {
                    //add to result
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left + 1]) left++;
                    left++;
                    right--;
                }
                else if(nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                }
                else if(nums[i] + nums[right] + nums[left] > 0) {
                    right--;
                }
            }
        }
        return res;
    }
}
