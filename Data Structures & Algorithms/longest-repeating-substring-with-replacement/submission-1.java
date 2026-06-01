class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0;
        int maxFreq = 0;
        int[] freq = new int[26];
        int maxLen = 0;
        for(int j = 0; j < s.length(); j++) {
            int index = s.charAt(j) - 'A';
            freq[index]++;
            maxFreq = Math.max(maxFreq, freq[index]);
            if((j - i + 1) - maxFreq > k) {
                freq[s.charAt(i) - 'A']--;
                i++;
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return maxLen;
    }
}
