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
    public TreeNode deleteNode(TreeNode root, int key) {
        return remove(root, key);
    }
    private TreeNode remove(TreeNode node, int val) {
        if(node == null) return null;
        
        if(val > node.val) node.right = remove(node.right, val);
        else if(val < node.val) node.left = remove(node.left, val);
        else {
            if(node.left == null) return node.right;
            else if(node.right == null) return node.left;
            else {
                TreeNode minNode = findMinValueNode(node.right);
                node.val = minNode.val;
                node.right = remove(node.right, minNode.val);
            }
        }
        return node;
    }
    private TreeNode findMinValueNode(TreeNode root) {
        TreeNode curr = root;
        while(curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }
}