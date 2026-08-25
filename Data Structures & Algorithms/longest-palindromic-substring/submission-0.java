class Solution {
    public String longestPalindrome(String s) {
        int l = s.length();
        char[] sArr = s.toCharArray();
        int[] res = new int[2];
        int left = 0, right = 0;
        int maxLen = 0;
        for(int i = 0; i < l; i++) {
            left = i; 
            right = i;
            while(left <= right && left >= 0 && right < l && sArr[left] == sArr[right]) {
                if(right - left + 1 > maxLen) {
                    maxLen = right - left + 1;
                    res[0] = left;
                    res[1]= right;
                }
                right++;
                left--;
            }
            left = i;
            right = i + 1;
            while(left <= right && left >= 0 && right < l && sArr[left] == sArr[right]) {
                if(right - left + 1 > maxLen) {
                    maxLen = right - left + 1;
                    res[0] = left;
                    res[1] = right;
                }
                right++;
                left--;
            }
        }
        return s.substring(res[0], res[1] + 1);
    }
}
