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
        q.add(new Pair(i, j));
        int[][] directions = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
           while(!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            q.poll();
            for(int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if(newRow < 0 || newRow == m || newCol < 0 || newCol == n || grid[newRow][newCol] == 0 || grid[newRow][newCol] == -1) {
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
