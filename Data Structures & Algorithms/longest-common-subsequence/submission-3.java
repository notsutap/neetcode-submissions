class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        // int[][] dp = new int[m + 1][n + 1];
        int[] prevRow = new int[n + 1];
        int[] curRow = new int[n + 1];
        
        for(int i = m - 1; i >= 0; i--) {
            curRow = new int[n + 1];
            for(int j = n - 1; j >= 0; j--) {
                if(s1.charAt(i) == s2.charAt(j)) {
                    curRow[j] = 1 + prevRow[j + 1];
                } else {
                    curRow[j] = Math.max(prevRow[j], curRow[j + 1]);
                }
            }
            prevRow = curRow;
        }
        return curRow[0];
    }
}
