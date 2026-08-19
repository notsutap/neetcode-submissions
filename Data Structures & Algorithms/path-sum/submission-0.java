/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        return helper(root, sum, targetSum);
    }
    private boolean helper(TreeNode node, int sum, int target) {
        if(node == null) return false;
        sum += node.val;
        if(node.left == null && node.right == null) {
            return sum == target;
        }
        return helper(node.left, sum, target) || helper(node.right, sum, target);
    }
}