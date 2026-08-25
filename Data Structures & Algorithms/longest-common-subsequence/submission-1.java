class Solution {
    private int[][] cache;
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        cache = new int[m][n];
        for (int[] row : cache) Arrays.fill(row, -1);
        return dfs(text1, text2, 0, 0);
    }
    private int dfs(String s1, String s2, int i1, int i2) {
        if(i1 == s1.length() || i2 == s2.length()) return 0;

        if(cache[i1][i2] != -1) return cache[i1][i2];

        if(s1.charAt(i1) == s2.charAt(i2)) {
            cache[i1][i2] = 1 + dfs(s1, s2, i1 + 1, i2 + 1);
        } else {
            cache[i1][i2] = Math.max(dfs(s1, s2, i1 + 1, i2), dfs(s1, s2, i1, i2 + 1));
        }
        return cache[i1][i2];
    }
}
