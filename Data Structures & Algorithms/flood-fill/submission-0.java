class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int R = image.length;
        int C = image[0].length;
        int orig = image[sr][sc];
        if(orig == color) return image;
        dfs(image, sr, sc, orig, color, R, C);
        return image;
        
    }
    private void dfs(int[][] image, int sr, int sc, int orig, int color, int rows, int cols) {
        if(sr < 0 || sr >= rows || sc < 0 || sc >= cols || image[sr][sc] != orig) return;
        image[sr][sc] = color;
        dfs(image, sr - 1, sc, orig, color, rows, cols);
        dfs(image, sr + 1, sc, orig, color, rows, cols);
        dfs(image, sr, sc - 1, orig, color, rows, cols);
        dfs(image, sr, sc + 1, orig, color, rows, cols);
    }
}