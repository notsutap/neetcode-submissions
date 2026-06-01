class Solution {
    public int characterReplacement(String s, int k) {
        int windowLength = 0;
        int l = 0;
        int[] freqArr = new int[26];
        char[] charArr = s.toCharArray();
        int maxLen = 0;
        int mostFreq = 0;
        for (int r = 0; r < charArr.length; r++) {
            freqArr[charArr[r] - 'A']++;
            mostFreq = Math.max(mostFreq, freqArr[charArr[r] - 'A']);
            for (int i = 0; i < 26; i++) {
                mostFreq = Math.max(mostFreq, freqArr[i]);
            }
            if ((r - l + 1) - mostFreq > k) {
                freqArr[charArr[l] - 'A']--;
                l++;
            }
            
            maxLen = Math.max(r - l + 1, maxLen);
        }
        return maxLen;
    }
}
