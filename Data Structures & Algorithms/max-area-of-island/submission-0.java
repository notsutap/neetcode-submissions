class Solution {
    private static final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        int max = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    res = Math.max(res, dfs(grid, i, j, m, n));
                }
            }
        }
        return res;
    }
    private int dfs(int[][] grid, int r, int c, int R, int C) {
        if(r < 0 || c < 0 || r >= R || c >= C || grid[r][c] == 0) return 0;
        grid[r][c] = 0;
        int res = 1;
        for(int[] dir : directions) {
            res += dfs(grid, r + dir[0], c + dir[1], R, C);
        }
        return res;
    }
}
