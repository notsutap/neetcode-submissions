class Pair {
    int first;
    int second;
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 0) {
                    q.add(new Pair(i, j));
                }
            }
        }
        if(q.size() == 0) return;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while(!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            q.poll();
            for(int[] dir : directions) {
                int newRow = dir[0] + row;
                int newCol = dir[1] + col;
                if(newRow < 0 || newRow == m || newCol < 0 || newCol == n || grid[newRow][newCol] != Integer.MAX_VALUE) {
                    continue;
                }
                grid[newRow][newCol] = grid[row][col] + 1;
                q.add(new Pair(newRow, newCol));
            }
        }
    }
}
