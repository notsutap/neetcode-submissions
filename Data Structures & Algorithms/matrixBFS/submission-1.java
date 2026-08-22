class Solution {
    public int shortestPath(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0][0] == 1) 
            return -1;
        Queue<int[]> q = new LinkedList<>();
        int length = 0;
        int R = grid.length;
        int C = grid[0].length;
        int[][] visited = new int[R][C];
        q.add(new int[2]);
        visited[0][0] = 1;

        while(!q.isEmpty()) {
            int qLen = q.size();
            for(int i = 0; i < qLen; i++) {
                int[] pair = q.poll();
                int r = pair[0];
                int c = pair[1];
                if(r == R - 1 && c == C - 1) return length;

                int[][] directions = {{r, c - 1}, {r, c + 1}, {r - 1, c}, {r + 1, c}};
                for(int j = 0; j < 4; j++) {
                    int newR = directions[j][0];
                    int newC = directions[j][1];
                    if(Math.min(newR, newC) < 0 || newR == R || newC == C || 
                        visited[newR][newC] == 1 || grid[newR][newC] == 1) {
                            continue;
                    }
                    q.add(directions[j]);
                    visited[newR][newC] = 1;
                }
            }
            length++;
        }
        return -1;
    }
}
