class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLength = 0;
        int length = 0;
        for(int num : nums) {
            set.add(num);
        }
        for(int num : nums) {
            if(!set.contains(num - 1)) {
                int current = num;
                length = 1;
                while(set.contains(current + 1)) {
                    current++;
                    length++;
                }
            }
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}
