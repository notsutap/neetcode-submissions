class Solution {
    public int characterReplacement(String s, int k) {
        int windowLength = 0;
        int l = 0;
        int[] freqArr = new int[26];
        char[] charArr = s.toCharArray();
        int maxLen = 0;
        int mostFreq = 0;
        for (int r = 0; r < charArr.length; r++) {
            windowLength = r - l + 1;
            freqArr[charArr[r] - 'A']++;
            for (int i = 0; i < 26; i++) {
                mostFreq = Math.max(mostFreq, freqArr[i]);
            }
            if (windowLength - mostFreq > k) {
                freqArr[charArr[l] - 'A']--;
                l++;
                windowLength = r - l + 1;
            }
            
            maxLen = Math.max(windowLength, maxLen);
        }
        return maxLen;
    }
}
