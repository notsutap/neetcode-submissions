class Solution {
    public int numIslands(char[][] grid) {
        int R = grid.length;
        int C = grid[0].length;
        int count = 0;
        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                if(grid[i][j] == '1') {
                    dfs(grid, i, j, R, C);
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid, int r, int c, int R, int C) {
        if(r < 0 || r >= R || c < 0 || c >= C || grid[r][c] == '0') return;

        grid[r][c] = '0';
        dfs(grid, r + 1, c, R, C);
        dfs(grid, r - 1, c, R, C);
        dfs(grid, r, c - 1, R, C);
        dfs(grid, r, c + 1, R, C);
    }
}
