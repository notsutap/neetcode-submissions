class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Queue<int[]> q = new LinkedList<>();
        int R = grid.length;
        int C = grid[0].length;
        int time = 0;
        int[][] visited = new int[R][C];
        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                if(grid[i][j] == 1) fresh++;
                else if(grid[i][j] == 2) q.add(new int[]{i, j});
            }
        }
        while(fresh > 0 && !q.isEmpty()) {
            int qLen = q.size();
            for(int i = 0; i < qLen; i++) {
                int[] pair = q.poll();
                int r = pair[0];
                int c = pair[1];
                for(int[] dir : directions) {
                    int newR = r + dir[0];
                    int newC = c + dir[1];
                    if(newR >= 0 && newC >= 0 && newR < R && newC < C && grid[newR][newC] == 1 && visited[newR][newC] == 0) {
                        fresh--;
                        q.add(new int[]{newR, newC});
                        visited[newR][newC] = 2;
                    }
                }
            }
            time++;
        }
        return fresh == 0 ? time : -1;
    }
}
