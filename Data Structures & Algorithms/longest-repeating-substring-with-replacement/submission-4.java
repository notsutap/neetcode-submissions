class Solution {
    public int characterReplacement(String s, int k) {
        char[] arr = s.toCharArray();
        int l = 0;
        int maxLen = 0;
        int maxFreq = 0;
        int[] freqArr = new int[26];
        for(int r = 0; r < arr.length; r++) {
            freqArr[arr[r] - 'A']++;
            maxFreq = Math.max(maxFreq, freqArr[arr[r] - 'A']);
            if((r - l + 1) - maxFreq > k) {
                freqArr[arr[l] - 'A']--;
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
}
