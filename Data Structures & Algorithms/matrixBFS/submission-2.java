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

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while(!q.isEmpty()) {
            int qLen = q.size();
            for(int i = 0; i < qLen; i++) {
                int[] pair = q.poll();
                int r = pair[0];
                int c = pair[1];
                if(r == R - 1 && c == C - 1) return length;
                for(int[] dir : directions) {
                    int newR = r + dir[0];
                    int newC = c + dir[1];
                    if(newR < 0 || newC < 0 || newR == R || newC == C || visited[newR][newC] == 1 || grid[newR][newC] == 1) continue;
                
                    q.add(new int[]{newR, newC});
                    visited[newR][newC] = 1;
                }
            }
            length++;
        }
        return -1;
    }
}
