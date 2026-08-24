class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[] prevRow = new int[col];
        if(grid[0][0] == 1 || grid[row - 1][col - 1] == 1) return 0;
        for(int i = row - 1; i >= 0; i--) {
            int[] curRow = new int[col];
            if(grid[i][col - 1] == 1) {
                curRow[col - 1] = 0; 
            } else if (i == row - 1) {
                curRow[col - 1] = 1;
            } else {
                curRow[col - 1] = prevRow[col - 1];
            }
            for(int j = col - 2; j >= 0; j--) {
                if(grid[i][j] == 1) {
                    curRow[j] = 0;
                    continue;
                }
                curRow[j] = curRow[j + 1] + prevRow[j];
            }
            prevRow = curRow;
        }
        return prevRow[0];
    }
}