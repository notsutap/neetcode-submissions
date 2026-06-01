class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0; 
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for(int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            while(set.contains(ch)) {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return maxLen;
    }
}
