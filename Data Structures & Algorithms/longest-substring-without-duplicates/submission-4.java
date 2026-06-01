class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        if (s.length() == 0)
            return 0;
        int window = 1;
        int l = 0;
        for (int r = 0; r < arr.length; r++) {
            while (set.contains(arr[r])) {
                set.remove(arr[l]);
                l++;
            }
            set.add(arr[r]);
            window = Math.max(r - l + 1, window);
        }
        return window;
    }
}
