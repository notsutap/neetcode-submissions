class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rl = 0, ru = matrix.length - 1;
        int rm = (rl + ru) / 2;
        while(rl <= ru) {
            rm = (rl + ru) / 2;
            if(target < matrix[rm][0]) ru = rm - 1;
            else if(target > matrix[rm][matrix[0].length - 1]) rl = rm + 1;
            else break; 
        }
        if(rl > ru) return false;
        int cl = 0, cu = matrix[0].length - 1;
        while(cl <= cu) {
            int cm = (cl + cu) / 2;
            if(target > matrix[rm][cm]) cl = cm + 1;
            else if(target < matrix[rm][cm]) cu = cm - 1;
            else return true;
        }
        return false;
    }
}
