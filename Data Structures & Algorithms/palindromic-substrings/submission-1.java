class Solution {
    public int countSubstrings(String s) {
        int sLen = s.length();
        char[] sArr = s.toCharArray();
        int count = 0;
        for(int i = 0; i < sLen; i++) {
            int left = i;
            int right = i;
            while(left <= right && left >= 0 && right < sLen && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
            left = i;
            right = i + 1;
            while(left <= right && left >= 0 && right < sLen && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }
        return count;
    }
}
