class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0;
        int max = Integer.MIN_VALUE;
        char[] arr = s.toCharArray();
        if(s.length() == 0) return 0;
        for(int r = 0; r < arr.length; r++) {
            while(set.contains(arr[r])) {
                set.remove(arr[l]);
                l++;
            }
            set.add(arr[r]);
            max = Math.max(r - l + 1, max);
        }
        return max;
    }
}
