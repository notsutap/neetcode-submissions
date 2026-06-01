class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[128];
        
        // initialize all to -1
        Arrays.fill(lastSeen, -1);

        int i = 0, maxLen = 0;

        for (int j = 0; j < s.length(); j++) {
            int idx = s.charAt(j);

            // if character was seen before
            if (lastSeen[idx] != -1) {
                i = Math.max(i, lastSeen[idx] + 1);
            }

            lastSeen[idx] = j; // update last seen index
            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
    }
}