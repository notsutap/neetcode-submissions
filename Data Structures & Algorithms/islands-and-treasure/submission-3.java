class Pair {
    int first;
    int second;
    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 0) {
                    helper(grid, i, j, m, n);
                }
            }
        }
    }
    public void helper(int[][] grid, int i, int j, int m, int n) {
        Queue<Pair> q = new LinkedList<>();
        int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        q.add(new Pair(i, j));
        while(!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            q.poll();
            for(int[] dir : dirs) {
                int newRow = dir[0] + row;
                int newCol = dir[1] + col;
                if(newRow < 0 || newCol < 0 || newRow == m || newCol == n || grid[newRow][newCol] == -1 || grid[newRow][newCol] == 0) {
                    continue;
                }
                if(grid[newRow][newCol] == Integer.MAX_VALUE || grid[newRow][newCol] > grid[row][col]) {
                    grid[newRow][newCol] = grid[row][col] + 1;
                    q.add(new Pair(newRow, newCol));
                }    
            }
        }
    }
}
